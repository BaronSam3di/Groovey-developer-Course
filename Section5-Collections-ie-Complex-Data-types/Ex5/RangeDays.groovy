/*
    Ranges
    
    Create a range from that enum
    Print the size of the Range
    Use the contains method to see if Wednesday is in that Range
    Print the from element of this reange 
    Print the to elelemt of this range
*/

enum Days {
    SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    
def dayRange = Days.SUNDAY..Days.SATURDAY
    
// for in loop
for(day in dayRange ){
    println day
   }
   
// using closures
dayRange.each {day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.WEDNESDAY)
   
