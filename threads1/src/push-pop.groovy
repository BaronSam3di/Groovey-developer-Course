List numbers = []

//push
10.times {
    println "Push:\t ${it}"
    numbers << it
}

println numbers

// pop
for( i in 9..0){
    println "pop:\t ${i}"
    numbers.pop()
}

println numbers
