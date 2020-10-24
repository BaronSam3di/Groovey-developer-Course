//String.metaClass.shout = { -> toUpperCase() }
//println "hello world".shout()

use(StringCatagory) {
/*
we are kind of cllaing anything in the StringCatagory
as a native function in this block. And it will only be available from within this use function
 */
    println "hello everybody!".shout()
}


// println "hello world".shout() -- this would fail