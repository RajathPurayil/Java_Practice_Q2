import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Java Calculator

        Scanner sc =new Scanner(System.in);
        int a=0;
        int b=0;

        System.out.println("## Welcome to Java Calculator ####");

        System.out.println("Enter the first number");

        a= sc.nextInt();

        System.out.println("Enter the Second Number");
        b=sc.nextInt();

        int sum=0;
        int multiplication;
        int substraction = 0;
        int average;
        int division=0;


        sum=a+b;
        multiplication=a*b;
        substraction=a-b;
        division=a/b;
        average=sum/2;

        System.out.println("### Output ###");

        System.out.println(a+"*"+b+"="+multiplication);
        System.out.println(a+"+"+b+"="+sum);
        System.out.println(a+"-"+b+"="+substraction);
        System.out.println(a+"/"+b+"="+division);
        System.out.println("The average is  ="+average);



        }

    }
