// each & eachWithIndex
List favNums = [2,8,7,11,73,4]

// Clunky way to iterate ...

for(num in favNums){
    println num
}

// better way of the same thing
favNums.each{ println it} 


// what about looking for the index?
// Clunky old way

for(int i=0; i<favNums.size(); i++){
    println "OLD $i:${favNums[i]}"
}

favNums.eachWithIndex { num, idx -> 
    println "NEW way $idx:$num"
}

// findAll() & findAll(Closure)

List days = [ "SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"]

List weekend = days.findAll { it .startsWith("S")}
println days
println weekend

// Collect method
// for example How can we multiply each number by 10??? 

List nums = [13,24,45,34,653,765476,7832,24277,88,2]

List numsTimesTen = []
nums.each { num -> 
    numsTimesTen << num * 10
  }
 
List newTimesTen = nums.collect {num -> num * 10}

println nums 
println numsTimesTen
println newTimesTen
