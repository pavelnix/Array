package ru.pavelnix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * �����, ������� ��������� RemovingRepetitiveSequencesArray
 */
public class RemovingRepetitiveSequencesArrayTest {
    private int[] array = {1, 2};
    private RemovingRepetitiveSequencesArray removingRepetitiveSequencesArray;

    /**
     * ����� ������������� ����� ������ ������
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        removingRepetitiveSequencesArray = new RemovingRepetitiveSequencesArray(array);
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
        assertArrayEquals(array, removingRepetitiveSequencesArray.getArray());
    }
}