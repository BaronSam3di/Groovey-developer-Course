def map = [:]        // withthe colon in the middle it is a map, without it is a List
println map 
println map.getClass().getName()
println '''

println map.class.name - this would return an error as maps need to use the explicit getClass methods. they differ becasue this map doesnt have a property called class
therfore we should always use getClass() etc

'''
def person = [first:"Bob",last:"Morton",email:"BobMorton@OCP.com"]
println person

println person.first

println "To add a value such as person.twitter = theRealboborton"
person.twitter = "theRealboborton"
println person

def emailKey = '---EmailAddress---'

def twitter = [username:"BobMorton",(emailKey):"BobMorton@OCP.com"] // need to have the brackets in order to pull in var types as keys

println person.size()
println person.sort() // sorts key

// Looping throught person
println "--- Looping throught person ---"
for(entry in person) {
    println entry
}

println "--- Looping throught key value pairs ---"
for( key in person.keySet() ){
    println "$key--:--${person[key]}"
}

