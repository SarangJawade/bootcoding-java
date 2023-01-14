package com.bootcoding.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("X number");
        int X = sc.nextInt();
        System.out.println("Y number");
        int Y = sc.nextInt();
        System.out.println("Z number");
        int Z = sc.nextInt();


        if(X>=Y && X>=Z ) {
            System.out.println(X+ "is greater");
        }
           else if(Y>=X && Y>=Z) {
            System.out.println(Y+ " is greater");
        }
                else{
                    System.out.println(Z+" is greater");
                }
            }
        }




