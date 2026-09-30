import java.util.Scanner;
public class Number_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        boolean isPossible = (k >= 4) && (k % 4 == 0);
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}