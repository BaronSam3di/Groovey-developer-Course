package com.ClaranceBoddiker

// Every read access to a property can be intrcepted by overriding the getProperty() methof od the current object.

class PropertyDemo {

    def Prop1 = "Prop1"
    def Prop2 = "Prop2"
    def Prop3 = "Prop3"

    def getProperty(String name){
        println "getProperty() called with argument $name"
        if(metaClass.hasProperty(this,name)){
        } else{
            println "Lets do something fun with this"
            return "Whimmy wham wham wozzle!"
        }
        metaClass.getProperty(this,name)
    }
}



def pd = new PropertyDemo()

println pd.Prop1
println pd.Prop2
println pd.Prop3
println pd.Prop4