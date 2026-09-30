import java.util.*;
public class Secondlargest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        int secondLargest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    
    }
    
}
