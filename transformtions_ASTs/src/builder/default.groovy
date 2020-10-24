package builder

Developer dan = Developer
        .builder()
        .firstName("Dan")
        .lastName("Zoom")
        .middleInitial("TJ")
        .email("Test@test.com")
        .languages(["Java","Groovy"])
        .build()

println dan
assert dan.firstName == "Dan"