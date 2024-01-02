package dsa;
import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temp in celcius:-");
        Scanner sc= new Scanner(System.in);
        float tempC=sc.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println("Temperature in ferahanite:-"+tempF);
    }
    
}
