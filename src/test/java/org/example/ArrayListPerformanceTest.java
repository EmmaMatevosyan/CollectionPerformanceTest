package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListPerformanceTest {

    @Test
    // Метод для тестирования производительности ArrayList
    public void testArrayListPerformance() {
        // Устанавливаем количество повторений
        int repetitions = 1000;
        // Вызываем метод для тестирования ArrayList
        ArrayListPerformance.testArrayList(repetitions);

        // Проверяем, что время добавления элементов больше 0
        assertTrue(ArrayListPerformance.addTime > 0);

        // Проверяем, что время удаления элементов больше 0
        assertTrue(ArrayListPerformance.deleteTime > 0);

        // Проверяем, что время получения элементов больше 0
        assertTrue(ArrayListPerformance.getTime > 0);
    }
}

