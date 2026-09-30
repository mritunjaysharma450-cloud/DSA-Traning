import java.util.*;
public class Spydetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int x = 0;
        int n = sc.nextInt();

        int [] arr = new int[n];
        int pos = 0;

        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

int num = arr[0]^arr[1]^arr[2];
        for ( int i = 0 ; i < n ; i++){
         if (arr[i] == num){
            System.out.println(i+1);
         }
        }
 
    }
}