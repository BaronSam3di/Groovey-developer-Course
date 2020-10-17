// Delegates.groovy

def writer = {
    append 'Dick Jones'
    append 'works at OCP'
}
def append(String s) {
    println "append() called with argument of: $s"
}

StringBuffer sb = new StringBuffer() // this includes an append method
writer.resolveStrategy = Closure.DELEGATE_FIRST // It will look in the 
writer.delegate = sb        // here were are delegateing the methods of our writer closure to the tring Buffer class thta does have an append

writer()



