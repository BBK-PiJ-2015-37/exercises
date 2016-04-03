package day1

int p1 = 0, p2 = 0
String turn = ""
boolean finished = false
while (!finished) {
    println ""
    println "Enter two characters representing a turn in"
    println "'Rock, Paper, Scissors'. R = rock, P = paper,"
    println "S = scissors. For example, enter PP or PR."
    println ""
    print "> "
    turn = System.console().readLine()
    if (!((turn == "PP") || (turn == "RR") || (turn == "SS") || (turn == "PR") || (turn == "RS") || (turn == "SP") || (turn == "PS") || (turn == "SR") || (turn == "RP"))) {
        println "That was not a valid entry. Please try again."
    } else {
        if ((turn == "PP") || (turn == "RR") || (turn == "SS")) {
            println "It's a draw!"
        } else if ((turn == "PR") || (turn == "RS") || (turn == "SP")) {
            println "Player 1 wins the turn!"
            p1++
        } else if ((turn == "PS") || (turn == "SR") || (turn == "RP")) {
            println "Player 2 wins the turn!"
            p2++
        }
        println "Player 1 " + p1 + ":" + p2 + " Player 2"
        if (p1 - p2 > 3) {
            println "Player 1 wins the game!"
            finished = true
        } else if (p2 - p1 > 3) {
            println "Player 2 wins the game!"
            finished = true
        }
    }
}