// if 
if(true)
    println "value is true"
    
// false | null | empty strings | empty collections
if(!false)
    println "value is false"


String name = "Barry"

if(name)
    println "name has a value of"

String last = ""
if (last)
    println "last has a value"
    
// if/else
def x = 5
if( x == 10 ){
    println "x is 10"
} else {
        println "x is not 10"
}

// Classic While loop

def i = 1
while(i <= 10){
    println i
    i++
}

// for in list 
def list = [1,2,3,4,5]
println "---- for in List ----" 
for(item in list){
    println item
}

// closure
println "---- Closures with lists -----"
def list2 = [1,2,3,4]
list2.each { println it}

// switch

def myLuckyNumber = 5
switch(myLuckyNumber) {
    case 1:
        println "number is 1"
    case 2:
        println "number is 2"
    case 3:
        println "number is 3"
    case 4:
        println "number is 4"
    case 5:
        println "Lucky me!"
        break
    default:
        println "Better luck next time" // witout a break the default will always print

}