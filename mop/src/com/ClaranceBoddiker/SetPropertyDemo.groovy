package com.ClaranceBoddiker

class POGO {

    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'somethingElse'    // this will always override the setting of the name with "somethingElse"

    }

}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'somethingElse'