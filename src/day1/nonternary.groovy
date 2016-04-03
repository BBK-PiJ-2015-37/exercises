package day1

String str = ""
boolean finished = false
posCount = 0
negCount = 0
zero = 0
while (!finished) {
    print "Enter a number (enter 00 to finish): "
    str = System.console().readLine()
    if (str == 00) {
        finished = true
    } else {
        int i = Integer.parseInt(str)
        if (i > 0) {
            posCount++
        } else if (i < 0) {
            negCount++
        } else {
            zero++
        }
    }
}
println "There were " + posCount + " positive numbers, " + negCount + " negative numbers and " + zero " zeroes."