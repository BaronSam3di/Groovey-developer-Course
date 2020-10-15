import groovy.transform.Immutable


@Immutable
class Customer{

    String first 
    String last 
    int age 
    Date since
    Collection favItems
}