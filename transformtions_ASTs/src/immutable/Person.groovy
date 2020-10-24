package immutable

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable          // make sure to use the groovy trnasform
class Person {
    String firstname, lastname

}
