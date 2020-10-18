package com.DickJones

@groovy.transform.ToString()
class Employee implements Serializable {

    String first, last, email

    String fullName

    void SetFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full Name: ${fullName}"
    }

}
