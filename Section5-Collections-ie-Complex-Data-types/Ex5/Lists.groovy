/*
    List Exercise
    
    Create a list of days ( Sun - Sat)
    Print out the list 
    Print the size of the list 
    Remove Saturday from the list 
    Add saturday back in by appending it to the list
    Print out the Wednesday using its index
    
 */
 
 def days = [ "SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"]
 
 println days
 println days.size()
 days.pop()
 println days
 days << "SATURDAY"
 println days
 println days[3]