package dsa;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operator:- ");
        char op=sc.next().trim().charAt(0);
        int ans=0;
        OUTER:
        while (true) {
            switch (op) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                    System.out.println("Enter 2 numbers:- ");
                    int num1=sc.nextInt();
                    int num2=sc.nextInt();
                    if(op=='+'){
                        ans=num1+num2;
                    }      if(op=='-'){
                        ans=num1-num2;
                    }      if(op=='*'){
                        ans=num1*num2;
                    }      if(op=='/'){
                        if(num2!=0){
                            ans=num1/num2;
                        }
                    }      if(op=='%'){
                        ans=num1%num2;
                    }      break;
                case 'x':
                case 'X':
                    break OUTER;
                default:
                    System.out.println("Invalid Operation !!");
                    break OUTER;
            }
            System.out.println("Anwser:- "+ans);
        }
        
    }
}
