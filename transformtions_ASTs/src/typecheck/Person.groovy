package typecheck

import groovy.transform.TypeChecked

@TypeChecked
class Person {
    String firstname, lastname
    String getFullName(){
        "$firstname $lastname"
    }
}