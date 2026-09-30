import java.util.Scanner;
public class Pythogorustriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A*A + B*B == C*C || A*A + C*C == B*B || B*B + C*C == A*A) {
            System.out.println("YES THEY ARE TRIPLETS");
        } else {
            System.out.println("NO");
        }
    }
    
}
