package day1

String str = ""
print "Enter a number (enter -1 to finish): "
str = System.console().readLine()
int i = Integer.parseInt(str)
boolean finished = false
boolean consec = true
boolean up = true
while (!finished) {
    print "Enter another number (enter -1 to finish): "
    str = System.console().readLine()
    int j = Integer.parseInt(str)
    if (j == -1) {
        finished = true
    } else {
        if (j == i-1) {
            up = false
        }
        if (up) {
            if (j != i+1) {
                consec = false
            } else {
                i = j
            }
        } else {
            if (j != i-1) {
                consec = false
            } else {
                i = j
            }
        }
    }
}
if (consec == true) {
    println "Yes"
} else {
    println "No"
}