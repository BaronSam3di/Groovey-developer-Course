Range myIntRage = (1..10) // the double indicate this is a range
println myIntRage
println myIntRage.class.name

println myIntRage.from
println myIntRage.to

assert (0..10).contains(3)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()

Date oneWeekAway = today +7 // 
println today
println oneWeekAway

Range days = today.. oneWeekAway
println days

Range letters = 'a'..'z'
println letters

for (i in 'a'..'z') {
    println "Hello ${i}"
}