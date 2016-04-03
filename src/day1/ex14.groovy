package day1

println 2
int count = 1
int i = 3
while (count < 1000) {
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
        count++
    }
    i++
}       