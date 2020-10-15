# Groovey-developer-Course


- Optionally typed language for the Java Platform.
- Inspired by Python, Smalltalk
- The groovy Compiler can compile Java
- Powerful feature such as Closures, Builders,
- Domain Specific Languages ( DSL)
- Great for writing concise and maintainable tests  

### sdk man

`sdk list` will list all every thing we could install, Grails, Groovy, Gradle etc  
`sdk list groovy` will list all the version of groovy available to install 

### groovysh

`groovysh -help` will tell us among other things which version we are running.

`groovysh` will put us into a groovy shell

The groovy shell will recognise when an expression is complete and only compile it when it is complete.

The shell also have some shortcut commands and aliases. To see these we can 
type `:h` in the grooovysh terminal.

### groovyc

groovyc is the command line compiler that allows you to compile your groovy into byte code.

`groovyc <theNameOfYourFile>`

You can also run this ".groovy" file with your java compiler too.

`groovyc -d classes *.groovy` will put all of the ".groovy" files in a directory called "classes"

### The Groovy Console

The groovy console is a GUI based window that allows us to create and run groovy scripts without the fuss of setting up an IDE. Its good for getting started and testing code. 

To open it type `groovyConsole` in your terminal adn then the GUI will appear once it has loaded. The groovy console also has the Groovy AST ( Abstract Syntax Tree) which allows you to see the java that made the simple groovy code you wrote. For example the getters and setters in Java that made the "Hello, World" String you printed using `println`.