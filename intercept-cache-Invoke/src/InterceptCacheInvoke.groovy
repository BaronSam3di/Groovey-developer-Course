// Intercept - Cache - invoke Pattern

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println "${name}() method was called..."

        if( name.startsWith('write') ){
            String language = name.split("write")[1]
            if( languages.contains(language)){
                def impl = { Object[] theArgs ->
                    println " I like ot write code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }
}

Developer Clarence = new Developer()
Clarence.languages << "Groovy"
Clarence.languages << "Go"
Clarence.languages << "C++"
    println Clarence.metaClass.methods.size()
Clarence.writeGroovy()
Clarence.writeGroovy()
Clarence.writeGroovy()
    println Clarence.metaClass.methods.size()
Clarence.writeGo()
