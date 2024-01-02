package dsa;
import java.util.*;
public class firstJava {
    public static void main(String[] args) {
        //1)Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.println("Enter the number:- ");
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a%2==0){
//            System.out.println("Even number");
//        }else System.out.println("Odd number");

        // 2)Take name as input and print a greeting message for that particular name.
//        System.out.print("Enter you name:- ");
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println("Welcome "+name);

        // 3)Simple Interest
//        System.out.println("Enter principal");
//        Scanner sc= new Scanner(System.in);
//        int p=sc.nextInt();
//        System.out.println("Enter time");
//        int t=sc.nextInt();
//        System.out.println("Enter rate");
//        int r= sc.nextInt();
//        int a = p+(1+r*t);
//        System.out.print("Amount:-  "+a);
                
        // 4)Take in two numbers and an operator (+, -, *, /) and calculate the value  
//          System.out.println("Enter first and second number:-");
//          Scanner sc= new Scanner(System.in);
//          int a= sc.nextInt();
//          int b= sc.nextInt();
//          int ans=0;
//          System.out.println("Choose operator (+,-,*,/):- ");
//          char op=sc.next().charAt(0);
//          if(op=='+'){
//              ans=a+b;
//          }else if(op=='-'){
//              ans=a-b;
//          }else if(op=='*'){
//              ans=a*b;
//          }else if(op=='/'){
//              ans=a/b;
//    }else System.out.println("Enter valid opeartion");
//          System.out.println("Answer:- "+ans);
          
        // 5) largest number
//          System.out.println("Enter the two numbers:-");
//          Scanner sc= new Scanner(System.in);
//          int a= sc.nextInt();
//          int b= sc.nextInt();
//          if(a>b){
//              System.out.println("largest number:- "+ a);
//          }else System.out.println("Largest number:- "+ b);

        // 6) input rupee output usd
//            System.out.println("Enter rupee:- ");
//            Scanner sc= new Scanner(System.in);
//            int a= sc.nextInt();
//            double b=0.012;
//            System.out.println("USD:- "+ a*b);

        // 7) calculate fibonacci series upto n
        System.out.println("Enter a number:-");
        Scanner sc= new Scanner(System.in);
        int count=sc.nextInt();
        int a=0,b=1,c,i;
        System.out.print("Fibonacci series:- ");
        for(i=0;i<count;++i){
            c=a+b;
            System.out.print(" "+a);
            a=b;
            b=c;
        }
        
        // 8) palindrome string
//        System.out.println("Enter the string:-");
//        Scanner sc= new Scanner(System.in);
//        String a=sc.next();
//        String b="";
//        int length=a.length();
//        for(int i=(length-1);i>=0;--i){
//            b=b+a.charAt(i);
//        }
//        if(a.toLowerCase().equals(b.toLowerCase())){
//            System.out.println("String is palindrome "+a);            
//        }else System.out.println("not palindrome "+a);
        
        
        // 9) armstrong number
//        int n, count = 0, a, b, c, sum = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        n = s.nextInt();
//        a = n;
//        c = n;
//        while(a > 0)
//        {
//            a = a / 10;
//            count++;
//        }
//        while(n > 0)
//        {
//            b = n % 10;
//            sum = (int)(sum+Math.pow(b, count));
//            n = n / 10;
//        }
//        if(sum == c)
//        {
//            System.out.println(c+ " is an Armstrong number");
//        }
//        else
//        {
//            System.out.println(c+ " is not an Armstrong number");
//        } 
    }
}
