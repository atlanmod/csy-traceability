document.addEventListener('DOMContentLoaded', init)

function init() {
  let data = fallbacks[fallbacks.length-2];

  var margin = {top: 20, right: 15, bottom: 120, left: 60}
  , width = 600 - margin.left - margin.right
  , height = 600 - margin.top - margin.bottom;

  // Find min and max timestamps
  const min_time = Math.min(data.m24[0].t, data.m21[0].t)
  const max_time = Math.max(data.m24[data.m24.length-1].t, data.m21[data.m21.length-1].t)

  var x = d3.scaleLinear()
      .domain([min_time, max_time])
      .range([ 0, width ]);

  var y = d3.scaleLinear()
      .domain([32700, 33600])
      .range([ height, 0 ]);

  var chart = d3.select('body')
      .append('svg:svg')
      .attr('width', width + margin.right + margin.left)
      .attr('height', height + margin.top + margin.bottom)
      .attr('class', 'chart')

  var main = chart.append('g')
      .attr('transform', 'translate(' + margin.left + ',' + margin.top + ')')
      .attr('width', width)
      .attr('height', height)
      .attr('class', 'main')

  // draw the x axis
  var xAxis = d3.axisBottom(x);

  main.append('g')
    .attr('transform', 'translate(0,' + height + ')')
    .attr('class', 'main axis date')
    .call(xAxis)
    .selectAll("text")
    .attr("transform", "rotate(-70)")
    .attr("x", -60)


  // draw the y axis
  var yAxis = d3.axisLeft(y);

  main.append('g')
    .attr('transform', 'translate(0,0)')
    .attr('class', 'main axis date')
    .call(yAxis);

  var g = main.append("svg:g");

  // Draw m21
  g.selectAll("scatter-dots")
    .data(data.m21)
    .enter().append("svg:circle")
    .attr("cx", function (d,i) { return x(d.t); } )
    .attr("cy", function (d) { return y(d.position); } )
    .attr("r", 4);

  g.append("path")
    .datum(data.m21)
    .attr('fill', 'none')
    .attr('stroke', '#333')
    .attr("d", d3.line()
          .x(function (d) { return x(d.t); } )
          .y(function (d) { return y(d.position); } )
         )

  // Draw m24
  g.selectAll("scatter-dots")
    .data(data.m24)
    .enter().append("svg:circle")
    .attr("fill", "#3da")
    .attr("cx", function (d,i) { return x(d.t); } )
    .attr("cy", function (d) { return y(d.position); } )
    .attr("r", 4);

  g.append("path")
    .datum(data.m24)
    .attr('fill', 'none')
    .attr('stroke', '#3da')
    .attr("d", d3.line()
          .x(function (d) { return x(d.t); } )
          .y(function (d) { return y(d.position); } )
         )
}
