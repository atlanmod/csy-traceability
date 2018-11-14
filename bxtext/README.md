# B Xtext project

An [Xtext](https://www.eclipse.org/Xtext/) project to parse B files.  The
advantage of using an Xtext grammar is the ability to construct a graph of a
whole B project (with proper scoping of variables).

To build, just load all the projects of this folder inside Eclipse.  If you
change the `B.xtext` grammar, you will need to regenerate the Xtext artifacts
(right-click the grammar in the Eclipse explorer ▶ Run As ▶ Generate Xtext
Artifacts).

To use, simply run a guest Eclipse application having with all the plugins of
the workspace loaded.  Now you should be able to load B files (`.mch`, `.imp`)
in the B editor created by Xtext.  You should have syntax highlighting,
auto-completion and parsing errors working.

In addition, the B files can now be treated as Ecore models: opening a B file
with the Sample Ecore Model Editor or the MoDisco Model Browser lets you browse
the parsed graph.
