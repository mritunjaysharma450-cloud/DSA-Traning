import java.util.*;
public class Twinsdividingcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] coins = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
            sum = sum + coins[i];
        }
        Arrays.sort(coins);
         int mymoney = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            mymoney = coins[i];
             count++;
             int remainingmoney = sum - mymoney;
            if(mymoney > remainingmoney){
            
                break;
            }
        }
        System.out.println(count);
    }
}
