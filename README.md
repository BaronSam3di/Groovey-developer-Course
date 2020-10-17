# Groovey-developer-Course


- Optionally typed language for the Java Platform. IT was designed to build on top of Java, not replace it.]
- Inspired by Python, Smalltalk
- The groovy Compiler can compile Java
- Powerful feature such as Closures, Builders,
- Domain Specific Languages ( DSL)
- Great for writing concise and maintainable tests  
- Much more than a scripting language

## sdk man

`sdk list` will list all every thing we could install, Grails, Groovy, Gradle etc  
`sdk list groovy` will list all the version of groovy available to install 

## groovysh

`groovysh -help` will tell us among other things which version we are running.

`groovysh` will put us into a groovy shell

The groovy shell will recognise when an expression is complete and only compile it when it is complete.

The shell also have some shortcut commands and aliases. To see these we can 
type `:h` in the grooovysh terminal.

## groovyc

groovyc is the command line compiler that allows you to compile your groovy into byte code.

`groovyc <theNameOfYourFile>`

You can also run this ".groovy" file with your java compiler too.

`groovyc -d classes *.groovy` will put all of the ".groovy" files in a directory called "classes"

## The Groovy Console

The groovy console is a GUI based window that allows us to create and run groovy scripts without the fuss of setting up an IDE. Its good for getting started and testing code. 

To open it type `groovyConsole` in your terminal adn then the GUI will appear once it has loaded. The groovy console also has the Groovy AST ( Abstract Syntax Tree) which allows you to see the java that made the simple groovy code you wrote. For example the getters and setters in Java that made the "Hello, World" String you printed using `println`.

You can pass file names to open in the groovyConsole eg - `groovyConsole assertions.groovy` 


## IntelliJ

My groovy files were placed at /Users/MyName/.sdkman/candidates/groovy

## Compiling our first script

1. We can write our script in a text editor , use groovyc to compile it and then run `groovy filename` minus the extension, eg `hello.groovy` is run as `groovyc hello`.
2. we can run it in the intelliJ Ui from three different locations in the UI.
3. We can run it by opening a `groovysh` and typing in the commands.


## Comments

` // this is a single line comment`

`/*

This is a multiline comment

look!!

*/`

/*
\* These are doc strings
\* that will be noticed by for documentation
*/

You can also run groovy scripts with a BASH shebang comment such as 

`#!usr/bin/env groovy`

## Data Types in Groovy

To understand Data types in Groovy we need to understand the ones that are available from JAva. Java is a statically typed language , which means that all variables need ot be declared before they can be used. 
This involves state the variables type and name. 

The 8+1 primitive data types in Java. `byte , short, int , long, float, double, char String, Boolean` 

## Closures
Closures are just like a method but it is a first class citizen of the language. A closure is an object and so can be used or passed around the program. That is the important distinction. Think of them as tools you can pick up and use in your code without having to assign them t oan object of a class. They are often used as iterators.

In the example below the arrow syntax ```->``` separates the arguments from the action of the function.

```
def sayHello = { name -> 
    println "Hello $name"
}
sayHello("Bob") 
```

IT: the implicit parameter - Below, if no augment is set up, a closure will default to an 'it' argument that acts as the default current variable/argument being worked.

```
List nums = [1,2,3,4,5]

nums.each({ 
    println it //  
})
```

### Closures are objects and last parameters

Declare a function..

```
def timesTen(num,closure){
    closure(num * 10)
}

timesTen(2, {println it})
```
Any time a method has a closure as its last parameter passed to it you can remove the braces so it ends up looking like a method/function.
```
timesTen(2) {println it}
``` 

and so...
```
timesTen(2) {
    println it
}
```

What if we didn't want an implicit parameters or we wanted to block parameters from being passed.
We can use the ```->``` of closures to explicitly declare it as a closure that has no arguments to the right hand side of the arrow.

```
def noparams = { ->
    println "I have no params"
}

noparams()
```

var-arg - allows us to pass as many args as we want to the closure with ...

```
def concat = { String... args ->
    args.join('')
 }
 
concat("a","b","c","d","e")
```

### Currying 

This referese the concept of partial application. It will let you set the value of param of a closure and return a new closure with one less parameter. 
