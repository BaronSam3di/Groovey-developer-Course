package singleton

//DataBaseConnection dbConnection = new DataBaseConnection()    // this would fail as we are being to general on accessing the class
//println dbConnection


DataBaseConnection db = DataBaseConnection.instance // here we are calling the only instance that we can
println db
