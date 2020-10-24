
import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'The 4 hour work week'
        isbn '985-4-307-78632-1'
        author( first:'Timothy',last:'Ferriss', twitter:'@tferriss')
        related 'the 4 hour Body','the four hour chef'
    }
    nextBook {
        title '#AskGaryVee'
        isbn '985-4-307-18654-1'
        author( first:'Gary',last:'Vaynerchuck', twitter:'@garyvee')
        related 'Jab jab jab , right hook','Crsh it!'
    }
}

new File ('data/books.json').write(builder.toPrettyString())