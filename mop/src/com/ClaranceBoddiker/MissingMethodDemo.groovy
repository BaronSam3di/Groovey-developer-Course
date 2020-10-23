package com.ClaranceBoddiker

/*
 groovy supports the concept of methodMissing.
 This method differs from invokeMethod in that it is only
 invoked in cases of a failed method dispatch, when no method can be found for
 the given name and/or the given argument;
*/


class MyEmployee {
    def methodMissing(String name, def args){
        if( name != 'someMethod'){
            throw new MissingMethodException(name,args)
        }
        println "Method Missing called on: $name"
        println "With Arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
emp.someOtherMethod(4,5,6)