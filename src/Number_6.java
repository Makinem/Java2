import java.util.Scanner;
public class Number_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        boolean isPossible = (k < n * m) && (k % n == 0 || k % m == 0);
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
