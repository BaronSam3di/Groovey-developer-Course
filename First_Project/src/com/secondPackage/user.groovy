@groovy.transform.ToString()
class User{

    Long id
    String firstName
    String lastName
    String email
    Date dob
    
    void printFullName(){
    println "FullName: $firstName $lastName"
    }
}

User user = new User(firstName:"Bob",lastName:"Smith")
println user