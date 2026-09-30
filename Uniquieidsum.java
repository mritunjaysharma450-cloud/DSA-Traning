import java.util.Scanner;
public class Uniquieidsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while(N > 0) {
            int lastdigit = N % 10;
            sum += lastdigit;
            N /= 10;
        }
        System.out.println("sum of student iddigits " +sum);
    }
    
}
