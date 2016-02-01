package ru.pavelnix;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Класс, который тестирует RemovingRepetitiveSequencesArray
 */
public class RemovingRepetitiveSequencesArrayTest {
    private int[] array = {1, 3, 3, 4, 5, 5};
    private int[][] expectedArray = {
            {1, 4},
            {1, 3, 3, 4, 5, 5},
            {1, 3, 3, 4, 5, 5}
    };

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
        assertArrayEquals(array, removingRepetitiveSequencesArray.getArray());
    }

    /**
     * Метод, который тестирует метод
     * removeRepetitiveSequences(),
     * который удаляет повторяющую последовательность чисел из массива,
     * если последовательность больше либо равна lengthRepetitiveSequences
     *
     * @throws Exception
     */
    @Test
    public void testRemoveRepetitiveSequences() throws Exception {
        int lengthRepetitiveSequences = 2;
        removingRepetitiveSequencesArray.removeRepetitiveSequences(lengthRepetitiveSequences);
        assertArrayEquals(expectedArray[lengthRepetitiveSequences - 1],
                removingRepetitiveSequencesArray.getArray());
    }
}