//def file = new File('dummy.txt')
//file.write("This is some text")
//
//
//file.append("This line was appended...\n")
//
//List lines = file.readLines()
//lines.each {line ->
//    println line
//}


// // -- List All files in a dir

//String dir = '/Users/geoffreyowden/mystuff/Groovey-developer-Course'
//new File(dir).eachFileRecurse {file ->
//
//    if( file.isFile() ) {
//        println file.name
//    }
//}


new File('.').eachFile { file ->
    if( file.name.endsWith('.groovy') ){
        println file.name
    }
}