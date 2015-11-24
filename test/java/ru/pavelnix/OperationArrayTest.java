package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * �����, ������� ��������� OperationArray
 */
public class OperationArrayTest {
    private int[] array = {1, 2};
    private OperationArray operationArray;

    /**
     * ����� ������������� ����� ������ ������
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        operationArray = new OperationArray(array);
        System.out.println("@Before");
    }

    /**
     * ���� �������
     *
     * @throws Exception
     */
    @Test
    public void testGetArray() throws Exception {
//        int[] array1 = {1, 3};
        assertArrayEquals(array, operationArray.getArray());
    }
}