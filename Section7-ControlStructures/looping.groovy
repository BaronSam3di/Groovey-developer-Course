// Loooping 
// --------------------

// while
List numbers = [1,2,3]
while (numbers){
    numbers.remove(0) // remove whats at the 0 index
}

assert numbers == []

/* for loops 

for(variable in iterable) {
    
}
*/

List nums = [1,2,3,4]

for(Integer i in nums){ // you can define the type if you like 
    println i
}

for( i in 'a'..'g'){
    println "letter: $i"
}


// return/break/continue

String getFoo() {
    "foo"
}

getFoo()

Integer a = 1
while(true){
    a++
    break
}
assert a == 2
 
for (String s in 'a'..'z') {
    if (s == 'a') continue
    println s
    if (s > "b") break
}