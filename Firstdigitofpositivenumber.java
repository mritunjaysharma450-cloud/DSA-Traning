import java.util.*;
public class Firstdigitofpositivenumber {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        while(N>=10){
            int fdigit = N%10;
            N = N/10;   
        }
        System.out.println(N);


        
    }
}
