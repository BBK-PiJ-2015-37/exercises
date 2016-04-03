package day1

print "Enter number of rows in pyramid: "
String s = System.console().readLine()
int nrows = Integer.parseInt(s)
int count = 1
while (count <= nrows) {
    int temp = count
    while (temp > 1) {
        print count
        temp--
    }
    println count
    count++
}
println "\\ldots"