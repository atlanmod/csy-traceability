$(document).click(function(ev) {
  if (ev.button != 0)
    return

  const el = $(ev.target).closest('li')

  // Reset view
  if (el.length === 0) {
    $('.highlight').removeClass('highlight')
    $('.open').removeClass('open')
    return
  }

  // Only clicks on fallbacks make sense
  if (!el.hasClass('fallback'))
    return

  // Mark the current entry
  $('.open').removeClass('open')
  el.addClass('open')

  // Highlight all the others
  el.data('events').split('::').map(t => t.trim()).forEach((t,i) => {
    const ev = document.getElementById(t)
    const n = Array.from(ev.parentNode.children).indexOf(ev)
    console.log(t, ev, i, n)
    $($(`section:eq(${i+1}) li`).get(n)).addClass('open')
  })
})
