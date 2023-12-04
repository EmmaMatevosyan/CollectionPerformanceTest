package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListPerformanceTest {

    @Test
    // Метод для тестирования производительности LinkedList
    public void testLinkedListPerformance() {
        // Устанавливаем количество повторений
        int repetitions = 1000;
        // Вызываем метод для тестирования LinkedList
        LinkedListPerformance.testLinkedList(repetitions);

        // Проверяем, что время добавления элементов больше 0
        assertTrue(LinkedListPerformance.addTime > 0);

        // Проверяем, что время удаления элементов больше 0
        assertTrue(LinkedListPerformance.deleteTime > 0);

        // Проверяем, что время получения элементов больше 0
        assertTrue(LinkedListPerformance.getTime > 0);

    }
}

