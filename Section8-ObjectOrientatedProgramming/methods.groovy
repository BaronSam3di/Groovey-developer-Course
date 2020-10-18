@groovy.transform.ToString
class Person {
    // constructor
    String first,last
    Person(String fullName){
        List parts = fullName.split(' ')
        first = parts[0]
        first = parts[1]
    } 
    
    // methods
    
    String getFullName(){
        "$first $last"
    }
    
    def bar(){
        
    }
    
    static String doGoodWork(){
        println "doing good work ...."
    }
    
    def someMethod(numbers){ // we could assign a type to this
        
    }
    List someMethod(List numbers = [1,2,3,4], Boolean canAccessAll = false){
        
    }
    
    def concat(String... args){
        println args.Length
    }
}

// Person p = new Person(first:"Dick",last:"Jones")
// println p

Person p = new Person("Bob Morton")
p.doGoodWork()
p.concat('a','b','c','d')
println p
