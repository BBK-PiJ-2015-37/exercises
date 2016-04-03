package day1

print "Enter number of terms desired: "
int n = Integer.parseInt(System.console().readLine())
double ans = 0.0
double temp = 0.0
int k = 0
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
print ans