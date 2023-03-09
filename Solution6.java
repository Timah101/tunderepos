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
public class Solution6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String enter = "";
        int counter = 0;

        Scanner me = new Scanner(System.in);
        boolean hasNext = me.hasNext();
        while (hasNext) {
            enter = me.nextLine();
            if (!enter.equals("")) {
                counter++;
            }
            if (enter.isEmpty()) {
                hasNext = false;
            }
            if(hasNext){
                System.out.println(counter + " "+enter);
            }
            

        }
    }
}
