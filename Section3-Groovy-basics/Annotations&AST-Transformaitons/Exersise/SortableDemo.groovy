import groovy.transform.*

@ToString
@Sortable
class Person{
    String first
    String last
}

def p1 = new Person(first:"Bob",last:"Morton")
def p2 = new Person(first:"Dick",last:"Jones")

def people = [p1,p2]
println people

def sorted = people.sort(false /* false means do not mutate the collection*/)
println sorted