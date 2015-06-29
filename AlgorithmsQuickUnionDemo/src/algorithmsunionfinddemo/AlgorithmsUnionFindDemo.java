/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsunionfinddemo;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class AlgorithmsUnionFindDemo {

    static final int length = 10;
    static int id[] = new int[length];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Initialization
        for (int i = 0; i < length; i++) {
            id[i] = i;
        }

        // Printing out
        System.out.print("    [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.print("]\n\n");

        // Union operations
        union(5, 0);
        union(9, 8);
        union(8, 5);
        union(1, 3);
        union(7, 0);
        union(1, 9);

    }

    static void union(int p, int q) {
        int memo = id[p];
        for (int i = 0; i < length; i++) {
            if (id[i] == memo) {
                id[i] = id[q];
            }
        }

        //Printing out
        System.out.print(p + "-" + q + " [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.print("]\n");
    }

}
