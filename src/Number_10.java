import java.util.Scanner;
public class Number_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int priceInKopecks = a * 100 + b;
        int paidInKopecks = c * 100 + d;
        int changeInKopecks = paidInKopecks - priceInKopecks;
        int e = changeInKopecks / 100;
        int f = changeInKopecks % 100;

        System.out.println(e + " " + f);
    }
}
