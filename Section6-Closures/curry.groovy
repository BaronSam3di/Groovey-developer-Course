def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(),"This is my first debug statement")

// here with the curry method we are createing a new Closure based on the log that we only need to supply two vars and not the Debug message
def debugLog = log.curry("DEBUG")

debugLog(new Date(), " this is a message ") 
debugLog(new Date(), " a different message")
debugLog(new Date(), "What aboout this ")
debugLog(new Date(), " feeling hot")
debugLog(new Date(), " Boom!!!")


// So we didnt need ot pass the date in. What aboyt the date param

def todayDebugLog = log.curry("DEBUG",new Date()) 

todayDebugLog("An error!!! ")
todayDebugLog("Other errro")
todayDebugLog("Other errors again")


// Right Curry - used to curry from the right hand side

def crazyPersonLog = log.rcurry("Why am I logging this way?")
crazyPersonLog("ERROR", new Date())

 // index based currying - 
 
 def typeMsLog = log.ncurry(1,new Date()) // we are setting the 1st variable of the log to be date as we create a new Closure from it
 
 typeMsgLog("ERROR","This is using ncurry")