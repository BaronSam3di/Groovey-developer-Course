Expando e = new Expando()

e.first = "Dan"
e.last = "Vega"
e.email = "bobMorton@gmail.com"

e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first:"Dick", last:"jones")
p.metaClass.email = "d.jones@ocp.com"
println p
println p.email
