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
public class Solution5 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int f = 0;
        for (int i = 0; i < t; i++) {
            System.out.println("Enter a");
            int a = in.nextInt();
            System.out.println("Enter b");
            int b = in.nextInt();
            System.out.println("Enter n");
            int n = in.nextInt();

            for (int k = 0; k < n; k++) {
                int b_power = (int) Math.pow(2, k);
                int b_power_b = b_power * b;
                int clone_b_power = b_power_b;
                int first_ans = a + clone_b_power;
                if (k == 0) {
                    System.out.print(" " + first_ans);
                } else {
                    first_ans = f + b_power_b;
                    System.out.print(" " + first_ans);
                }
//                System.out.println(b_power);

                f = first_ans;

                n = n--;
            }

        }

//        System.out.println(ans);
        in.close();
    }
}
