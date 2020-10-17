def foo = {
    println it
}

foo('dan')

// what if we didnt want an implicit parameters

def noparams = { ->
    println "I have no params"
}

noparams()

def sayHello = { first, last ->
    println "Hello , $first $last"
}

sayHello("Bob","Morton")

// default values

def greet = { String name = "Dick Jones" , String greeting -> 
    println "$greeting , $name"
}

greet("Hi")

// var-arg - allows us to pass as manny args as we want to the closure with ...

def concat = { String... args ->
    args.join('')
 }
 
concat("a","b","c","d","e")


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters        // useful for finding out whats going on
    println c.parameterTypes                   // also useful for finding out whats going on
 }
 
def someClosure = { int x, int y -> x+y }

someMethod(someClosure) 
 
