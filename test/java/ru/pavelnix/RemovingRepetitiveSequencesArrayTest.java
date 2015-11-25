package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Класс, который тестирует RemovingRepetitiveSequencesArray
 */
public class RemovingRepetitiveSequencesArrayTest {
    private int[] array = {1, 3, 3, 4, 5, 5, 5};
    private int[] array1 = {1, 4};
    private int[] array2 = {1, 3, 3, 4};
    private RemovingRepetitiveSequencesArray removingRepetitiveSequencesArray;

    /**
     * Метод выполняющийся перед каждым тестом
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        removingRepetitiveSequencesArray = new RemovingRepetitiveSequencesArray(array);
    }

    /**
     * Тест геттера
     *
     * @throws Exception
     */
    @Test
    public void testGetArray() throws Exception {
//        int[] array1 = {1, 3};
        assertArrayEquals(array, removingRepetitiveSequencesArray.getArray());
    }

    /**
     * Метод, который тестирует метод
     * removingRepetitiveSequencesArray.action(),
     * который удаляет повторяющую последовательность чисел из массива
     *
     * @throws Exception
     */
    @Test
    public void testAction() throws Exception {
        removingRepetitiveSequencesArray.action();

        assertArrayEquals(array1, removingRepetitiveSequencesArray.getArray());
    }

    /**
     * Метод, который тестирует метод
     * removingRepetitiveSequencesArray.actionV2(),
     * который удаляет повторяющую последовательность чисел из массива,
     * если последовательность больше либо равна 3
     *
     * @throws Exception
     */
    @Test
    public void testActionV2() throws Exception {
        removingRepetitiveSequencesArray.actionV2();

        assertArrayEquals(array2, removingRepetitiveSequencesArray.getArray());
    }
}