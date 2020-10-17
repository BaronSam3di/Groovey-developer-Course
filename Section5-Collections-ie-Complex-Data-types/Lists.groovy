def ArrayListOfNums = [1,2,3,4,5,6,2,3,4,7,4,5,3] // 
println ArrayListOfNums
println ArrayListOfNums.class.name

def myLinkedList = [1,2,3,4,5,6,2,3,4,7,4,5,3] as LinkedList // LinkedList is a keyword
println myLinkedList
println myLinkedList.class.name


// add | remove | get | clear

// add
ArrayListOfNums.push(99)
ArrayListOfNums.putAt(4,77)
ArrayListOfNums[1] = 101

println ArrayListOfNums + [3,4,6]
println ArrayListOfNums

ArrayListOfNums << 66 // adds to a list
println ArrayListOfNums

// remove
println "----remove from Lists----"
ArrayListOfNums.pop()
println ArrayListOfNums

ArrayListOfNums.removeAt(0) // remove from index 0
println ArrayListOfNums

def newList = ArrayListOfNums - 3 // removes all ocurances of 3 
println newList
println ""

// get from Lists
println "----get from Lists----"
println ArrayListOfNums[4]

println ArrayListOfNums.getAt(0..3) // prints the nums at these index
println ArrayListOfNums


ArrayListOfNums.clear() // we can also redeclare an empty list
println ArrayListOfNums


// Flattern lists

println " ---- Flattern lists ---- "
nums = [1,2,3,4,5]
nums << [1,2,3]
nums << [7,8,9]

println nums.flatten()
println nums


println " ---- Unique set of the list ---- "
nums = [1,1,2,2,30,0,0,3,4,4,5,5,6,6,7,7,8,8,-1,-2,-3,-5]
println nums
println nums.unique()

println " ---- Print as nums as a set ---- "
println nums as Set


println " ---- Print as nums as a SortedSet ---- "
println nums as SortedSet