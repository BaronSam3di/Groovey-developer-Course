@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
)
// If we dont have this in out class path the script will go and get it for us so it can run.
// this means that  Icould send this script to you and even if you didn't have the commons library, this script would pull down the dependencies for you
import org.apache.commons.lang3.text.WordUtils

String name = "Monty Pythons Flying Circus"
WordUtils wordUtils = new WordUtils()
println wordUtils.initials(name) // should print MPFC to the terminal