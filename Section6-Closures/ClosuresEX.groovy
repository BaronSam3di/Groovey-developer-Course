/*
    Closure Basics
    ------------------
    - Locate the class java.lang.Closure and spend a few minites looig thought documenttaion. 
    - Create a method that accepts a closure as an argumant\- Create a cosure that performs some acrion \-Call the method and pass te closure to t.
    - Create a list and use the each to itereate over eac hotem in the list and pront ot out
        - You can use the implicit or use your own variable 
    - Create a map of data nd iterate ove it using the each methiod.
        This method can take a closure that accepts 1 or 2 arguments/ Use 2 arguments and print out the key and value on each line.
    - demonstrate the use of curry and tru to come up wht an exampe different fro mthe one we used in the lecture.
*/

def mymethod(Closure c) {
    c()
}
def foo = {
    println "foo..."
}

mymethod(foo)
List days = [ "SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"]
days.each{ day -> 
    println "Today is $day"
}


Map RobocopMovieQuotes = ["Robocop":"Your move creep","Dick Jones":"You just F*** with the wrong guy","Clarence Boddicker":" Can you fly bobby?"]
RobocopMovieQuotes.each { k,v ->
    println "$k says \"$v\"" 
} 

def greet = { String greeting, String name -> 
    println "$greeting $name"
}

greet("Hi", "Bob")
def sayHello = greet.curry("Hi")
sayHello("Dick")


/*
 Explore the GDK 
--------------
- Search for the find and findAll methods. What is the difference between the two?
    Write some code to show ow they both work.
- search for the any and every methods.

*/


List people = [
    [name:"Tom",city:"Stepney"],
    [name:"Dick",city:"London"],
    [name:"Harry",city:"Birmingham"],
    [name:"Sharron",city:"Birmingham"],
    [name:"Mel",city:"London"],
    [name:"Balhead",city:"Bletchley"],
    [name:"Dred",city:"Peckham"],
    [name:"Stevie Hyper D",city:"Tottenham"],
]

println people.find {person -> person.city =="Peckham"}
println people.findAll {person -> person.city =="London"}
println people.any {person -> person.city =="Bletchley"}
println people.every {person -> person.city =="Bletchley"}
println people.every {person -> person.name.size() >= 3 }


def peopleByCity = people.groupBy { person -> person.city }
println peopleByCity

def Londoners = peopleByCity["London"]
Londoners.each {
    println it
    }