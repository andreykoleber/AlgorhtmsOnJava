/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsonjava.sort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Andrey Koleber
 */
public class Selection {

    public static void sort(Comparable[] a) {
        //Алгоритм для сортировки
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;                    
                }
            }
            exch(a, i, min);
        }
    }

    private static                                                                                                                                                                                                                                                                            boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        //Вывод массива в одной строке
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.print();
    }

    public static boolean isSorted(Comparable[] a) {
        //Проверка упорядоченности элементов массива
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        //Чтение строк из стандартного ввода, их сортировка и вывод.
        String[] a = new String[] {"s", "o", "r", "t", "e", "x", "a", "m", "p", "l", "e"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
