package day1

print "Enter an integer: "
int n = Integer.parseInt(System.console().readLine())
int lo = 0
int hi = 0
if (n <= 2) {                      //If n is less than or equal to 2, return 2
    println 2
} else {                           //If n is prime, return n
    boolean prime = true
    int j = 2
    while (j <= n/2) {
        if (n % j == 0) {
            prime = false
            break
        } else {
            j++
        }
    }
    if (prime) {
        println n
    } else {                       //If n not prime, begin by finding first prime below n
        boolean found = false
        int current = n
        while (!found) {
            prime = true
            j = 2
            while (j <= current/2) {
                if (current % j == 0) {
                    prime = false
                    break
                } else {
                    j++
                }
            }
            if (prime) {
                found = true
                lo = current
            } else {
                current--
            }
        }
        found = false             //Then find first prime above n
        current = n
        while (!found) {
            prime = true
            j = 2
            while (j <= current/2) {
                if (current % j == 0) {
                    prime = false
                    break
                } else {
                    j++
                }
            }
            if (prime) {
                found = true
                hi = current
            } else {
                current++
            }
        }
        if (n - lo < hi - n) {      //Print closest prime to n
            println lo
        } else if (n - lo > hi - n) {
            println hi
        } else {
            println lo + ", " + hi
        }
    }
}