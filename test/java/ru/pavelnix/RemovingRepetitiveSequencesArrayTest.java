package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Класс, который тестирует RemovingRepetitiveSequencesArray
 */
public class RemovingRepetitiveSequencesArrayTest {
    private int[] array = {1, 2, 2, 2, 3, 3};
    private int[] array1 = {1};
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

    @Test
    public void testAction() throws Exception {
        removingRepetitiveSequencesArray.action();

        assertArrayEquals(array1, removingRepetitiveSequencesArray.getArray());
    }
}