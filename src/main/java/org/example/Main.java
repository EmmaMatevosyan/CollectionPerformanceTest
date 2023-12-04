package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of repetitions: ");
        Scanner input = new Scanner(System.in);
        int repetitions = input.nextInt();

        System.out.println();
        ArrayListPerformance.testArrayList(repetitions);

        System.out.println();
        LinkedListPerformance.testLinkedList(repetitions);

    }
}
