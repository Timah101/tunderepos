/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author takano
 */
import java.util.Scanner;

public class Solution2 {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int i = scan.nextInt();
        System.out.println("enter second number");
        scan.nextLine();
        System.out.println("enter third number");
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}