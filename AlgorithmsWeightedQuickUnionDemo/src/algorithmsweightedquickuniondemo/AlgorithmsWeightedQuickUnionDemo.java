/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsweightedquickuniondemo;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class AlgorithmsWeightedQuickUnionDemo {

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
        union(4, 3);
        union(1, 0);
        union(4, 8);
        union(9, 6);
        union(1, 9);
        union(5, 8);
        union(2, 5);
        union(4, 0);
        union(9, 7);

    }

    static int count(int x) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (id[i] == id[x]) {
                count++;
            }
        }
        return count;
    }

    static int findRoot(int x) {
        while (x != id[x]) {
            x = id[x];
        }
        return x;
    }

    static void union(int p, int q) {
        int pWeight = count(p);
        int qWeight = count(q);

        if (pWeight < qWeight) {
            id[findRoot(p)] = findRoot(q);
        } else {
            id[findRoot(q)] = findRoot(p);
        }

        //Printing out
        System.out.print(p + "-" + q + " [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.print("] p-" + pWeight + " || q-" + qWeight + "\n");
    }

}
