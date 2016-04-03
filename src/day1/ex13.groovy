package day1

println 2
int i = 3
while (i <= 1000) {
    int j = 2
    boolean prime = true
    while (j < i) {
        if (i % j == 0) {
            prime = false
            break
        }
        j++
    }
    if (prime == true) {
        println i 
    }
    i++
}       