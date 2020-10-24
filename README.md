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

### Closures >> Delegates

Maybe you think that a Closure is a lamda expresion to support function programming. tis is half right. Being able to change the closures delegate makes them really unique. The delegate scope is part of three scopes that a closure has.

```this```. The THIS scope corresponds to the enclosing class where the closure us defined.
```owner```. The OWNER corresponds to the enclosing object where the closure is defined, which may be either a class or a closure.
```delegate```. Corresponding to a third part object where methods, calls or properties are resolved whenever the receiver of the message is not defined. This is where the magic starts to happen.

## Control Structures

### Groovy truth

All of these can be true

```
Boolean
Matcher
Collection
Map
String
Number // all true apart from 0
Char
not NULL
```

### Runtime MetaProgramming 

This is the writing of computer programs, that then write or manipulate other programs or write to themselves.

- Meta Object Protocol (MOP)

"The MOP is a collection of rules of how a request for a method call is handled bhy the Groovy runtime system and how to control the intermediate layer." - Groovy in Action 2md Edition

Whenever calls a method groovy will ask the intermediate layer on a set of rules in tree. This intermediate layer is called teh MOP.

The three classes of object that can be called when working with Groovy are the POJO, POGO and the Groovy interceptor. 

The Decision tree for a method call in groovy is as follows.

1. Does the class implement GroovyImperceptible
    YES - Call its InvokeMethod() - Break
2. NO - Does the method exist in the MetaClass or this.Class?
    YES - Call interceptor or original method - Break
3. NO - Does the Property exist in the MetaClass or Class?
    YES - Is the the Property type Closure?
        YES - Call closure's call() method. Break
4. NO - Does it have methodMissing()?
        YES - Call its methodMissing() - Break
5. NO - Does it have invokeMethod()
       YES -  Call its InvokeMethod(). - Break
       NO - Throw MissingMethodException() - Break
     
### Transformations

Groovy uses annotations in the code to declare certain extensions to existing native methods. For example if you place at the top of your class deceleration. The slow way to set these up is within the class body; If you type cmd+n in IntelliJ to get the menu up. However if you tpe "@xxxxxxxxxx" at the top of the function you can call it in a much simpler way.

```
@ToString(includeNames = true,excludes = ["email"])             <<<
class Person {
    String first, last, email
}
``` 
This will format the printing of this class to include the variable names and exclude the email.

there are many of these types of [Transformations](https://groovy-lang.org/metaprogramming.html#_available_ast_transformations).

@ToString
@EqualsAndHashCode              // Checks equality by values not ===
@TupleConstructor
@Canonical    // Combines ToString, EqualsAndHashCode and TupleConstructor

@Singleton      // makes sure only one instance of a class can exist and so follows your particular standard
@Sortable(includes = ['lastname','firstname'])   // makes things easier to sort. This will sort by lastname and then by firstname
@immutable      // makes instances UNchangeable ie 'final'
@TypeChecked    // Allows us to use groovy in a more static way by being more robust with the checking of var types
@CompileStatic  // allows you to 
@Builder        / gives you new wa yto construct objects. Builders are from the 'groovy.transform.builder' package

### Builders

These allow you to build out other code such as xml or HTML which can be a tedious task in Groovy.
`builders can write ot files for you among other controls. Ken Cousin suggests using hte tests from the open source language to understand the ways the different builders work. 


## HTTP status codes

These are codes that a call would return to give you status about the call we made


### 1xx - Informational

### 2xx - Success
- 200 - OK. Success
- 201 - New resource was successfully created
- 204 - Fulfilled request but No Content to return
### 3xx - Redirection
- 301 - Moved permanently - The resource has been moved to a new resource.
- 304 - Not modified. the content is there but it has not changed
- 307 - Temporary Redirect. Suggest repeating with a different URI.
### 4xx - Client Error
- 400 Bad request - Malformed syntax or Not understood
- 401 Unauthorised - Authentication has failed.
- 403 Forbidden - Legal request but you don't have permission so authentication is irrelevant
- 404 Not Found - Could not find the requested resource
### 5xx - Server Error
- 500 Internal Server error - unexpected condition which prevented the server from fulfilling the request.
- 502 Bad Gateway - the upstream server sent an invalid request.