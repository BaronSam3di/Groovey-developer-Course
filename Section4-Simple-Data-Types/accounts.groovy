// this provides an example of operator overlaoding by createing our own addition

class Account {

    BigDecimal balance = 0
    String type = ""
    
    Account deposit(float amount) {
        this.balance = this.balance + amount
        }
    
    Account type(String accountType) {
        this.type = accountType 
        }
    
    Account plus(Account other) {
        new Account (type:"combined")
        println this.balance + other.balance
        }
        
    String toString(){
    "Account Balance: $balance"
    }
}

Account savings = new Account(type:"checking")
checking.deposit(100.00)
Account checking = new Account(type:"savings")
savings.deposit(500.00)

BigDecimal total = savings + checking
println total
