package dsa;
import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        // Separate a single digit from number
//        int num=sc.nextInt();
//        while (num > 0) {
//        System.out.print( num % 10);
//        num = num / 10;
//       }
        // Q.1 Area of Circle
//        System.out.println("Enter the radius");
//        int r=sc.nextInt();
//        double pi=3.14;
//        double a=pi*r*r;
//        System.out.println("Area of circle:- "+a);

        // Q.2 Area of Triangle
//        System.out.println("Enter the breadth");
//        int b=sc.nextInt();
//        System.out.println("Enter the height");
//        int h=sc.nextInt();
//        float a=(b*h)/2;
//        System.out.println("Area of triangle:- "+a);
        
        // Q.21 Fibonacci series
//        System.out.println("Enter the number:-");
//        int count=sc.nextInt();
//        int a=0,b=1,c,i;
//        System.out.print("Fibonacci series:- ");
//        for (i=0;i<count;i++) {
//            c=a+b;
//            System.out.print(" "+a);
//            a=b;
//            b=c;
//        }
        
        //Q.23 print factor of number
//        System.out.println("enter the number:-");
//        int n= sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.print(i+" ");
//            }
//        }

        //Q.24 Take integer inputs till the user enters 0 and print the sum of all numbers
//        System.out.println("enter the number:-");
//        int n= sc.nextInt();
//        int sum=0;
//        while (n >0) {
//            sum = sum + n;
//            n=sc.nextInt();
//        }
//        System.out.println(sum);

        //Q.25 Take integer inputs till the user enters 0 and print the largest number
//        System.out.println("enter the number:-");
//        int n= sc.nextInt();
//        int l=0;
//        while (n >0) {
//            if(n>l){
//                l=n;
//            }
//            n=sc.nextInt();
//        }
//        System.out.println(l);

        //Q.26 Addition of two numbers
//        System.out.println("Enter the two numbers:-");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= a+b;
//        System.out.println("add:- "+c);

    // Intermediate Problem
        //Q.1 Factorial program     
//        System.out.println("Enter the number:-");
//        int n=sc.nextInt();
//        int f=1;
//        while(n>0){
//            f=f*n;
//            n--;
//        }
//        System.out.println(f);
        
        //Q.14 Armstrong number
//        System.out.println("Enter the number:-");
//        int a,b,c,count=0;
//        double sum=0;
//        int n=sc.nextInt();
//        a=n;
//        c=n;
//        while(a>0){
//            a=a/10;
//            count++;
//        }
//        while(n>0){
//            b=n%10;
//            sum=sum+Math.pow(b, count);
//            n=n/10;
//        }
//        if (sum==c) {
//            System.out.println(c+" is Armstrong number");
//        }else System.out.println(c+" is not Armstrong number");

        // Q.16 Reverse a string
//        System.out.println("Enter a string:-");
//        String n=sc.nextLine();
//        for (int l = n.length();  l>0; l--) {
//            System.out.print(n.charAt(l-1));            
//        }

        //Q.17 Palindrome number
//        System.out.println("enter a number:-");
//        int n=sc.nextInt();
//        int rev=0;
//        int rem;
//        int org=n;
//        while(n>0){
//            rem=n%10;
//            rev=rev*10+rem;
//            n/=10;
//        }
//        if (org==rev) {
//            System.out.println("Palindrome");
//        } else System.out.println("Not palindrome");

        //Q.21 Vowel consonant
//        System.out.println("Enter a string:");
//        String s=sc.next();
//        s=s.toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
//                System.out.println("Vowels:- "+s.charAt(i));
//            }else System.out.println("consonant:- "+s.charAt(i));
//        }

        //Q.23 Check leap year
//        System.out.println("Year");
//        int y= sc.nextInt();
//        if (y%4==0) {
//            System.out.println("Leap Year");
//        }else System.out.println("not leap year");

        //Q.24 sum of digits of numbers
//        System.out.println("Enter number");
//        int n=sc.nextInt();
//        int d;
//        int sum=0;
//        while(n>0){
//            d=n%10;
//            sum+=d;
//            n/=10;
//        }  System.out.println(sum);

        //Q.25 calculate the even days of month
        int count=0;
        int days=31;
        for (int i = 0; i < days; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The days kunal can go out: "+count+" days");

        //Q.26 Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
//        int nsum=0;
//        int esum=0;
//        int osum=0;
//        System.out.println("Enter the Numbers:-");
//        while(true){
//        int n=sc.nextInt();
//        if(n==0){
//            break;
//        }
//        if (n<0) {
//            nsum+=n;
//        }else if (n%2==0) {
//            esum+=n;
//        }else{
//            osum+=n;
//        }
//        
//        }
//        System.out.println("Negative numbers:- "+nsum);
//        System.out.println("Even positive numbers:- "+esum);
//        System.out.println("odd positive numbers:- "+osum);
    }
}   
        
  
