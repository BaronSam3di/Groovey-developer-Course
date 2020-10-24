package sorted


Person DickJones1 = new Person(firstname:"Dick",lastname:"Jones" )
Person DickJones2 = new Person(firstname:"Bob",lastname:"Jones" )
Person DickJones3 = new Person(firstname:"Clarence",lastname:"Jones" )
Person DickJones4 = new Person(firstname:"Murphy",lastname:"Jones")
Person DickJones5 = new Person(firstname:"Jon",lastname:"Smith")

def Jones = [DickJones1,DickJones2,DickJones3,DickJones4,DickJones5]

// println Jones.toSorted() // this would be the clunky way
println Jones.toSorted()