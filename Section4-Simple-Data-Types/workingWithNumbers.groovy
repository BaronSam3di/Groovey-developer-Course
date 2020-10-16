// :: Groovy Number Defaults
// -------------------------------

def number = 10 
println number.class

def decimal = 5.50
println decimal.class

// :: Converting Data types
// -------------------------------
// Explicit - aka Casting

def myFloat = (float) 1.0 // here we are explicitly saying ot the compiler, evn though it could be an int 1, make it a float
println myFloat.class

// Implicit - Coercion



// Rules for +,-,*
// -------------------------------

Float f = 5.25
Double d = 10.50

def result = d / f
println result
println result.class

Float a = 10.75
Float b = 53.75

def result2 = b / a
println result2
println result2.class


// if either operand is a big decimal

def x = 34.5 // BigDecimal
def y = 15
def bigResult = x / y
println bigResult
println bigResult.class

// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer

// Double division
println 5.0d - 4.1d // result is 0.9000000000000004, hence BigDecimal presicion 
// there for this is better
println 5 - 4.1 // this equals 0.9


// Integer division

def intDiv = 1 / 2
println intDiv // this is much different than Java where we would get 0
println intDiv.getClass().getName()
println 1.intdiv(2) // this will give us a Java style 0

// GDK Methods - theseare good to know
// -------------------------------------------------

assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer // enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber() // this is useing a string method to convert to numbers
assert 5 == '5'.toInteger()

// times | upto | downto | step

20.times {
print '-'
}

1.upto(10){ num ->
println num }

10.downto(1) { num ->
println num }

0.step(1,0.1) { num -> 
println num}
