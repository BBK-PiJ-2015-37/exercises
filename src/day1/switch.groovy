package day1

boolean finished = false
while (!finished) {
    println "Please choose an option:"
    println "For �Checking you balance�, please enter 1"
    println "For �Purchases�, please enter 2"
    println "For �Refunds�, please enter 3"
    println "For �Queries about the warranty�, please enter 4"
    println "For �Returning faulty goods�, please enter 5"
    println "For any other query, please enter 0"
    String s = System.console().readLine()
    int choice = Integer.parseInt(s)
    switch (choice) {
        case 1:
            println "Your balance is healthy!"
            finished = true
            break
        case 2:
            println "You have bought a pug. Ew..."
            finished = true
            break
        case 3:
            println "No refunds, sorry!"
            finished = true
            break
        case 4:
            println "Please send all warranty questions to Tokyo."
            finished = true
            break
        case 5:
            println "No returns, sorry!"
            finished = true
            break
        case 0:
            println "All our operators are busy right now. Try later."
            finished = true
            break
        default:
            println "That is not a valid option, please try again."
            println ""
            break
    }
}