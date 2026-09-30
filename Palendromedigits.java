import java.util.*;
public class Palendromedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og = n;
        int reversed = 0;
        while(n > 0){
            int lastdigit = n % 10;
            reversed = reversed * 10 + lastdigit;
            n /= 10;
        }
        if(reversed == og){
            System.out.println("YES IT IS PALENDROME");
        }
        else{
            System.out.println("NO IT IS NOT PALENDROME");
        }


    }
    
}
