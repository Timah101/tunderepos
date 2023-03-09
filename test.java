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
public class test {

    public static void main(String args[]) {

        int a = 5;
        int b = 3;
        int n = 5;
        int f = 0;

        for (int i = 0; i < n; i++) {
            int b_power = (int) Math.pow(2, i); //2^n-1

            int b_power_b = b_power * b; //(2^n-1)*b
            int clone_b_power = b_power_b;
            int first_ans = a + clone_b_power;
            if (i == 0) {
                System.out.println("series condition = " + first_ans);
            }
            else {
                first_ans = f + b_power_b;
                System.out.println("series = " + first_ans);
            }
//            System.out.println("B + power = " + b_power_b);
//            System.out.println("series = " + first_ans);
//            System.out.println("seriessssssss2 = " + f);

            f = first_ans;

            n = n - 1;
        }

    }
}
