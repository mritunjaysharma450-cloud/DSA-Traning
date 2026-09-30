import java.util.*;
public class Sumofevendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while(N > 0) {
            int ldigit = N % 10;
            if(ldigit % 2 == 0) {
                sum += ldigit;
            }
            N = N / 10;
        }
        System.out.println("Sum of even digits: " + sum);
    }
}
