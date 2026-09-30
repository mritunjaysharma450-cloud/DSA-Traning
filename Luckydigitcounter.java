import java.util.*;
public class Luckydigitcounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(N >0){
            int ldigit = N%10;
            if(ldigit == 7){
                count++;
            }
            N = N/ 10;
        }
        System.out.println(count);
    }
    
}
