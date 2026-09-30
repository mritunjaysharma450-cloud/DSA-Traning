import java.util.*;
public class Soldierandbanana {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        int total = 0 ;

        for(int i=1;i<=w;i++){
            total += k*i;
        }
        if(total > n){
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }

    }
    
}
