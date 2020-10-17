def c = { }
println c.class.name
println c instanceof Closure

def sayHello = { name -> 
    println "Hello $name"
}

sayHello("Bob")

List nums = [1,2,3,4,5]

nums.each({ num ->
    println num // if no agument is set up , a closure will default to an 'it' argumanet that acts as the current variable being worked. 
})

// Closures are objects and last paarameteres

def timesTen(num,closure){
    closure(num * 10)
}

timesTen(2, {println it})
// Any time a method has a closure as its last paramenter passed to it you can remove the braces so it ends up looking like a method/function.
timesTen(2) {println it}
and so
timesTen(2) {
    println it
}