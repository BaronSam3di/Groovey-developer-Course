package com.theRealDickJones.Domain

@groovy.transform.ToString()
class Iphone extends Phone {    // when we call the extends , we are inheriting from these other classes

    String iosVersion

    def homeButtonPressed() {

    }

    @Override   // lets the compiler we are doing our revised version
    def powerOn(){


    }
}
