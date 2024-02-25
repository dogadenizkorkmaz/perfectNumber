import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, result=0; //define integer value
        Scanner input = new Scanner(System.in); //define scanner
        System.out.print("Enter the Number :  "); //get value from user
        n = input.nextInt(); //assign the entered value to n


        for(int i=1; i<n; i++){ //Sum of factors from 1 to n
            if(n%i==0){
                result+=i;
            }
        }
        if(result==n){//It is perfect if the sum of the factors from 1 to n is equal to n.
            System.out.println("It's Perfect Number!!!");
        }else{
            System.out.println("It's Not Perfect...");
        }
    }
}