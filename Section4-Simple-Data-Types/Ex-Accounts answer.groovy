@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type // checking or saving
    
    BigDecimal deposit(BigDecimal amount){
        balance +=amount
    }
    
    BigDecimal withdraw(BigDecimal anount){
        balance -+ amount
    }
    
    BigDecimal plus(Account account){
        this.balance + account.balance
    }
}

Account checking = new Account(type:"checking")
checking.deposit(100.00)

Account savings = new Account(type:"savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings 
println total