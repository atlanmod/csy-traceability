//alias_log=Log
//alias_b=http://www.clearsy.com/B-extended
//alias_trace=http://TraceabilityMetamodel
//alias_uml=http://SimpleUMLComponents

rule specification
match t : trace!TraceabilityLink
with  v : b!Variable {
  compare {
    return t.rightLinkEnd.traceableArtefact.includes(v);
  }
}

rule events
match t : trace!TraceabilityLink
with  o : log!Event {
  compare {
    return t.leftLinkEnd.traceableArtefact.includes(o);
  }
}

rule events2
match t : trace!TraceabilityLink
with  o : log!Trace {
  compare {
    return t.leftLinkEnd.traceableArtefact.includes(o);
  }
}

rule designComponent
match t : log!Trace
with  c : uml!Component {
  compare {
    return c.name.startsWith(t.sensor);
  }
}
