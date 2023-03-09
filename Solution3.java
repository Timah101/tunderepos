/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author takano
 */
public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        int x = 0;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
            //Complete this line

            System.out.printf("%-15s", s1);
            System.out.printf("%03d %n", x);

        }

        System.out.println("================================");

    }
}
