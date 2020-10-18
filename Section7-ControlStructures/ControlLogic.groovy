// if (boolean expression) { // logic}

if (true){
    println "true"
}

if (true)
    println 'true'
    
def age = 34

if(age >= 35){
    println "Could be an MP"
}

if(false) {
    println "True"
} else {
    println "false"
}

if (age > 35){ 
    println "You are older"
} else if (age == 35) { 
    println "You are 35"
} else {
    println "something else..."
}

// terenery operator (expression ? true : false
def name = 'Bob'
def isitBob = (name.toUpperCase() == "BOB") ? 'YES' : 'NO'
println isitBob

def msg 
def output = (msg != null) ? msg : 'No new messages....' 
// the elvis operator lets us shorthand the terneray
def elvisOuput=  msg ?: 'Can you see Elvis ?:'
println elvisOuput

// -----------Switch ---------------
def num = 12

switch(num) {
    case 1..5:
        println "In range 1 to 5"
        break
    case 5..10:
        println "In range 5 to 10"
        break
    case String :
        println " it is a String"
        break
    case Float :
        println " it is a Float"
        break
    case [1,2,12] :
        println "It is in the list "
        break
    default:
        println "Defaulting" 
}

// in 
def validAges = 18..35
def someAge = 19
println someAge in validAges
