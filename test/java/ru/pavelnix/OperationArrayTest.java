package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Класс, который тестирует OperationArray
 */
public class OperationArrayTest {
    private int[] array = {1, 2};
    private OperationArray operationArray;

    /**
     * Метод выполняющийся перед каждым тестом
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        operationArray = new OperationArray(array);
        System.out.println("@Before");
    }

    /**
     * Тест геттера
     *
     * @throws Exception
     */
    @Test
    public void testGetArray() throws Exception {
//        int[] array1 = {1, 3};
        assertArrayEquals(array, operationArray.getArray());
    }
}