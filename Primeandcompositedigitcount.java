import java.util.*;
public class Primeandcompositedigitcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int primenumber = 0;
        int compositenumber = 0;
        while(N>0){
            int lastdigit = N % 10;
            if(lastdigit==2 || lastdigit==3 || lastdigit==5 || lastdigit==7){
                primenumber++;
            }
            else if(lastdigit == 4 || lastdigit== 6 || lastdigit==8){
                compositenumber++;
            }
          N= N/10;
        }
        System.out.println("Prime numbers count are"+ primenumber);
        System.out.println("Composite numbers count are"+ compositenumber);

    
    }
    
}
