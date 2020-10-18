package com.ClaranceBoddiker

// This method is called when the method you called is not present on a Groovy object.

class InvokeDemo {

    def invokeMethod(String name, Object args){
        return "called invoked method $name $args"
    }

    def test() {
        return "Method exists"
    }
}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "Method exists"
assert invokeDemo.someMethod() == 'called invoked method []'