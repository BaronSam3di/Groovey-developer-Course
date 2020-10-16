//Working with Strings in Groovy


// Java :

char c = 'c'
println c.class

String str = "this is a string"
println str.class

// Groovy ::

def c2 = 'c'
println c2.class

def str2 = 'this is a different string'
println c2.class


// string interpolation - Strings and Gstrings
// G-strings are juts formatted strings 

String name = "Bob"
String msg = "Hello $name" // -- THIS KIND OF STRING NEEDS TO HAVE "DOUBLE QUOTES"
println msg 

String msg2 = "We can evaluate expressions here :${1+1}"
println msg2


// Multiline strings - NOte: Single and double uotes matter

def aLargeMsg = '''
this is 
    over 
        many 
                        lines
'''
println aLargeMsg

def anotherLargeMsg = """
this is             also
    over         many                lines
    but includes interpolation - see: ${2+2}
"""
println anotherLargeMsg


// dollar slashy - $/  - STRING - /$. This allows you to escape slash chars.

def folder = $/C:\Alice\Bob\Charlie\Dan/$

print folder



