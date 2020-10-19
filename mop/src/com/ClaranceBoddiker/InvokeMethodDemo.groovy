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

def myDemo = new InvokeDemo()

assert myDemo.test() == "Method exists"
assert myDemo.someMethod() == 'called invoked method []'