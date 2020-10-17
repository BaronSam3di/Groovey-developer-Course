/*
    Maps
    
    Create a map of days of the week 
        1: Sunday, 2: Monday ...etc
    Print out the map
    Print out the class name of the map
    Print the size of the map
    Is ther a method that would easiliy print out all the dasy (values?
    without closures you may have to look at the JAva API for LinkedHashMAp

*/

Map map = [1:"SUNDAY",2:"MONDAY",3:"TUESDAY",4:"WEDNESDAY",5:"THURSDAY",6:"FRIDAY",7:"SATURDAY"]

println map
println map.getClass().getName()
println map.size()
println map.values()