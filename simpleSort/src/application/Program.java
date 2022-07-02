package application;


import entities.SimpleSort;

import java.util.Scanner;

/*
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

Read three integers and sort them in ascending order. After, print these values in ascending order,
a blank line and then the values in the sequence as they were readed.
Input
The input contains three integer numbers.
Output
Present the output as requested above.
*/
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros inteiros");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
        SimpleSort simpleSort = new SimpleSort(3, 2, 1);
        System.out.println(simpleSort.sortingNumbers());
        sc.close();
    }
}