import java.util.*;
public class sumofroundnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 10 != 0) {
                    count++;
                }
                n /= 10;
            }
            System.out.println(count);
        }

    }
}
