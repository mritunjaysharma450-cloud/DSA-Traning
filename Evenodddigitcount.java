import java.util.*;
public class Evenodddigitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int evennumber = 0;
        int oddnumber = 0;
        while(N > 0) {
            int ldigit = N % 10;
            if(ldigit % 2 == 0) {
                evennumber++;
            } else {
                oddnumber++;
            }
            N = N / 10;
        }
        System.out.println("Even digit count: " + evennumber);
        System.out.println("Odd digit count: " + oddnumber);
    }
}
