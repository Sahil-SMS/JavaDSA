package dsa;
import java.util.*;
public class nine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Q.1 Largest number
//        System.out.println("Enter the 3 numbers");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int max=a;
//        if (b>max) {
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println("Max:- "+max);
        
        //Q.2 Case checker
//        System.out.println("Enter the character:-");
//        char ch=sc.next().trim().charAt(0);
//        if (ch>='a'&&ch<='z') {
//            System.out.println("Lowercase");
//        }else
//        System.out.println("Uppercase");

        //Q.3 Fibonacci number
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        int count=2;
//        while(count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println("Fibonacci Number:-"+b);
        
        //Q.4 Count the same number
//        int n=45535;
//        int count=0;
//        while(n>0){
//            int rem=n%10;
//            if (rem==5) {
//                count++;
//            }
//            n=n/10;
//        }
//        System.out.println(count);
        
        //Q.5 Reverse the number
        int n=123546;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
