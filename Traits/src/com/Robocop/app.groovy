package com.Robocop

import com.Robocop.Traits.Bird

// traits allow is to compose capabilities into pour classes. Similar t Java 8 default methods. the fdifference is Traits can contain state.

Bird b = new Bird()
assert b.fly() == "Im flying"
assert b.speak() == "Sqwaaak!!"
