// OOP

class Person {
    
    String firstName, lastNAme // feild, or property
    def dob 
        // private | protected | public
    protected String f1,f2,f3
    private Date createdOn = new Date()
    
    static welcomeMsg = " Hello and welcome!" // with a static feild you can call this with out createing an instance
    public static final String WELCOME_MSG = "Glad to meet you!"    // this is a CONSTANT
    
    //local vars
    def foo(){
        String msg = "Good Day"
        String firstName = "Dick Jones"
        println "$msg, $firstName"
       }
}

// eg
def person = new Person()
println person.foo()