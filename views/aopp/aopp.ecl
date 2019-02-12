//alias_log=Log
//alias_b=http://www.clearsy.com/B

rule identifiers
match t : log!Trace
with  v : b!Variable {
  compare {
    return t.variable = v.name;
  }
}