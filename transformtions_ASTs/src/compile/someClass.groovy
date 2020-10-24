package compile

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

@CompileStatic              // this could be assigned at the class or method level, as below
class someClass {
    String foo(){
        "foo"
    }
    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)   // this wont do the checks on this method
    void noReturn(){

    }
}
