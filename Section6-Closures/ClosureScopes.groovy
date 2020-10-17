/*
    This - corresponds to the encloseing class where the closure is defined
    owner - corresponds to the enclosieg pbject where the closure is defined, whoch may be either a class or a closure
    delegate - corresponds to a third party object where methods calls or properites are resolved whenever the reciever of the messahge is not defined
*/

class ScopeDemo {
    
    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()