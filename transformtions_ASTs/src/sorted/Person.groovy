package sorted

import groovy.transform.Canonical
import groovy.transform.Sortable

@Sortable(includes = ['lastname','firstname'])
@Canonical
class Person {
    String firstname, lastname

}
