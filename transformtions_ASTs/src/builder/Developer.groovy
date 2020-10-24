package builder

import groovy.transform.ToString
import groovy.transform.builder.Builder


@Builder
@ToString
class Developer {
    String firstName, lastName, middleInitial, email
    Date hireDate
    List languages
}
