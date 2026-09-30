import java.util.*;
public class Largestdigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int largestdigit = 0;
        while( N > 0){
            int ldigit = N % 10;
            if(ldigit > largestdigit){
                largestdigit = ldigit;
            }
            N = N / 10;
        }
        System.out.println(largestdigit);
    }
    
}
