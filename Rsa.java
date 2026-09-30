import java.util.*;
public class Rsa {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x * y;
        int k = (x - 1) * (y - 1);
        
        int e = 2 ;
        int d = 5 ;
        int msg = 7;

        int encrypted = (int) (Math.pow(msg , e)%n);
        int decrypted = (int) (Math.pow(encrypted , d)%n);
        System.out.println("Encrypted message is " + encrypted);    
        System.out.println("Decrypted message is " + decrypted);       
        System.out.println("Public key is " + e + " " + n);
        System.out.println("Private key is " + d + " " + n);
        System.out.println("Value of n is " + n);
        System.out.println()

}

}