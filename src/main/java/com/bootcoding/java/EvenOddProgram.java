package com.bootcoding.java;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int a = 10;
        n = a + 2 + ++a; //23

        //n = a + 2 + a++; //22




        if(n%2==0){
            System.out.println(n+" is even num");

        }else{
            System.out.println(n+" is Odd num");
        }
    }
}
