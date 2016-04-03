package day1

int numberToGuess = Math.abs(1000 * Math.random())
int nGuesses = 1
boolean correct = false
String s = ""
println "Try to guess my number!"
while (!correct) {
    print "Tell me a number: "
    s = System.console().readLine()
    int guess = Integer.parseInt(s)
    if (guess == numberToGuess) {
        correct = true
    } else if (guess < numberToGuess) {
        println "No! My number is higher."
        nGuesses++
    } else if (guess > numberToGuess) {
        println "No! My number is lower."
        nGuesses++
    }
}
println "CORRECT!"
println "You needed " + nGuesses + " guesses."