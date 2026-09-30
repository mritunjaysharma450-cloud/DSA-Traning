import java.util.*;
public class Elephantsteps {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int steps = 0;
    while(n>0){
        n = n-5 ;
        steps++;
    }
    System.out.println(steps);

    }

}

