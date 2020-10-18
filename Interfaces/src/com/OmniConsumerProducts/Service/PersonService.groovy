package com.OmniConsumerProducts.Service

class PersonService implements IPersonService{


    @Override
    Person find() {
        Person p = new Person(first:"Dan",last:"Vega")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first:"Bob",last:"Morton")
        Person p2 = new Person(first:"Dick",last:"Jones")
        [p1,p2]
    }
}
