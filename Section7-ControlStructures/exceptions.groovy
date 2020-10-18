// Exceptions
// ------------------------------------------------
// you can do try catch, or Try catch Finally
// IN groovy every exception is opetional , wich means 
def foo() {
    throw new Exception("-----foo exeption-----")         // foo will always throw an exception
}

List log = []
try {
    println "giving it a try"
    foo()
    
} catch( Exception e) {
    log << e.message
} finally {
    log << "finally"
}

println log

// Java 7 introduced a multi-Catch syntax -- the below wont run btw

try {
    // do stuff
} catch( FileNotFoundExeption | NullPointerException e) {
    println e.class.name
    println e.message
}