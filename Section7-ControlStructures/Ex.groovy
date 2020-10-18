// this provides an example of operator overlaoding by createing our own addition

class Account {

    BigDecimal balance = 0.0
    String type = ""
    
    
    def deposit(BigDecimal amount){
        if(amount < 0){
            throw new Exception("Deposit amount must be greater than 0")
        } 
        balance += amount
    }
        
    def deposit(List amounts){
         for(amount in amounts) {
             deposit(amount)
         }
}
}


Account checking = new Account()
checking.deposit(10)
println checking.balance

try {
    checking.deposit(-1)
} catch( Exception e) {
   println e.message
}

println checking.balance

checking.deposit([1,2,3,4,5,6])
println checking.balance
