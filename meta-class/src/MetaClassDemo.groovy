// MetaClass Demo



/*
The expando class allows us to
write properties an methods to it on the fly on a per instance basis.
 */
Expando e = new Expando()
//e.name = 'Dan'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()


class Developer {

}
Developer clarence = new Developer()

clarence.metaClass.name = "Boddicker"
clarence.metaClass.writecode = { -> println "$name loves to write code ..." }
clarence.writecode()

// for every instance - BE careful
String.metaClass.shout = { -> toUpperCase() }
println "hello dan".shout()