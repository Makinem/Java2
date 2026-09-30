import java.util.Scanner;
public class Number_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        boolean isPossible = (k == 3) || (k == 5) || (k >= 6);
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
