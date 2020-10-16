/* REGEX
// find operator(=~)
// match operator(==~)
// pattern operator(~string)

// --- Patterns ---- 
// abc        - find an a followed by a b followed by a c
// b[aeiout] - match "bat", "bet", "bit",  "bot" and "but".
// <TAG/b[^>]*(.?)</TAG> - matches the opening and closing pair of a specific HTML tag
// \b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b - matches any email addres


// Java Sample Patteren

import java.util.regex.*;
Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println patterns.class


// What patterens will like in grovy

String slashy = /a\b/

println slashy.class

def pattern = ~/a\b/
println pattern.class
 */
// ---- Demos----


def text1 = "Being a Cleavland Sports Fan is no way to go through life" // true
def pattern = ~/Cleavland Sports Fan/
def finder = text1 =~ pattern

println finder
println finder.size() // should be 1
println matcher


def text2 = "Cleveland Sports Fan"
def patteren = ~/Cleveland Sports Fan/
def mather = text2 ==~ pattern

println match 

if(matcher) {
    println "do something"
}

def text3 = "Being a Cleavland Sports Fan is no way to go through life" // true
def pattern2 = ~/Cleavland/

newtext = text3.replaceFirst(pattern2,"Buffalo")
println newtext