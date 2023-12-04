package org.example;

        import java.util.ArrayList;
        import java.util.List;

public class ArrayListPerformance {

    public static long addTime;
    public static long deleteTime;
    public static long getTime;

    public static void testArrayList(int repetitions) {
        //int repetitions = entered_time; //1000; // Количество повторений вызова методов
        List<Integer> arrayList = new ArrayList<>();

        // Метод add
        long startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        addTime = endTime - startTime;

        // Метод delete
        startTime = System.nanoTime();
        for (int i = repetitions - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        deleteTime = endTime - startTime;

        // Метод get
        for (int i = 0; i < repetitions; i++) {
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            arrayList.get(i);
        }

        endTime = System.nanoTime();
        getTime = endTime - startTime;

        // Вывод результатов
        System.out.println("\033[1;4m" + "ArrayList Performance Results:" + "\033[0m");
        System.out.format("%-10s %-15s %-15s%n", "Method", "Repetitions", "Time in ns");
        System.out.format("%-10s %-15d %-15d%n", "add", repetitions, addTime);
        System.out.format("%-10s %-15d %-15d%n", "delete", repetitions, deleteTime);
        System.out.format("%-10s %-15d %-15d%n", "get", repetitions, getTime);

    }
}
