package org.example;
import java.util.LinkedList;
import java.util.List;
public class LinkedListPerformance {
    public static long addTime;
    public static long deleteTime;
    public static long getTime;

    public static void testLinkedList(int repetitions) {
        //repetitions Количество повторений вызова методов
        List<Integer> linkedList = new LinkedList<>();

        // Метод add
        long startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        addTime = endTime - startTime;

        // Метод delete
        startTime = System.nanoTime();
        for (int i = repetitions - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        deleteTime = endTime - startTime;

        // Метод get
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            int element = linkedList.get(i);
        }
        endTime = System.nanoTime();
        getTime = endTime - startTime;

        // Метод delete
        startTime = System.nanoTime();
        for (int i = repetitions - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        deleteTime = endTime - startTime;

        // Вывод результатов
        System.out.println("\033[1;4m" + "LinkedList Performance Results:" + "\033[0m");
        System.out.format("%-10s %-15s %-15s%n", "Method", "Repetitions", "Time in ns");
        System.out.format("%-10s %-15d %-15d%n", "add", repetitions, addTime);
        System.out.format("%-10s %-15d %-15d%n", "delete", repetitions, deleteTime);
        System.out.format("%-10s %-15d %-15d%n", "get", repetitions, getTime);

    }
}

