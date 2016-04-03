
import java.util.Scanner;

public class Ex12 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.

        int cost, paid, diff;
        int note50;
        int note20;
        int note10;
        int note5;
        int coin200;
        int coin100;
        int coin50;
        int coin20;
        int coin10;
        int coin5;
        int coin2;
        int coin1;
        System.out.print("Please enter total cost of purchase in \u00a3s: ");
        cost = (int) (input.nextDouble() * 100);
        System.out.print("Please enter amount paid in \u00a3s: ");
        paid = (int) (input.nextDouble() * 100);
        if (paid < cost) {
            System.out.println("The customer has not paid enough");
        } else {
            diff = paid - cost;
            note50 = (diff - (diff%5000))/5000;
            diff = (diff - (note50 * 5000));
            note20 = (diff - (diff%2000))/2000;
            diff = (diff - (note20 * 2000));
            note10 = (diff - (diff%1000))/1000;
            diff = (diff - (note10 * 1000));
            note5 = (diff - (diff%500))/500;
            diff = (diff - (note5 * 500));
            coin200 = (diff - (diff%200))/200;
            diff = (diff - (coin200 * 200));
            coin100 = (diff - (diff%100))/100;
            diff = (diff - (coin100 * 100));
            coin50 = (diff - (diff%50))/50;
            diff = (diff - (coin50 * 50));
            coin20 = (diff - (diff%20))/20;
            diff = (diff - (coin20 * 20));
            coin10 = (diff - (diff%10))/10;
            diff = (diff - (coin10 * 10));
            coin5 = (diff - (diff%5))/5;
            diff = (diff - (coin5 * 5));
            coin2 = (diff - (diff%2))/2;
            diff = (diff - (coin2 * 2));
            coin1 = diff;
            System.out.println("");
            System.out.println("Give the following change:");
            System.out.println("Fifty pound notes: " + note50);
            System.out.println("Twenty pound notes: " + note20);
            System.out.println("Ten pound notes: " + note10);
            System.out.println("Five pound notes: " + note5);
            System.out.println("Two pound coins: " + coin200);
            System.out.println("One pound coins: " + coin100);
            System.out.println("Fifty pence coins: " + coin50);
            System.out.println("Twenty pence coins: " + coin20);
            System.out.println("Ten pence coins: " + coin10);
            System.out.println("Five pence coins: " + coin5);
            System.out.println("Two pence coins: " + coin2);
            System.out.println("One penny coins: " + coin1);
        }
    }
}