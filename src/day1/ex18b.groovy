package day1

int n = 1
int k = 0
int count = 0
double ans = 0.0
double temp = 0.0
while ((3.14159265358-ans).abs() > 0.000000000001) {
    while (k < n) {
        if (k % 2 == 0) {
            temp = 4/(2 * k + 1)
            ans = ans + temp
            k++
        } else {
            temp = -4/(2 * k + 1)
            ans = ans + temp
            k++
        }
    }
    println ans
    n++
    count++
}
println "Number of terms required: " + count
   