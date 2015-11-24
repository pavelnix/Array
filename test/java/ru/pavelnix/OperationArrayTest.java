package ru.pavelnix;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 24.11.2015.
 */
public class OperationArrayTest extends TestCase {
    private int[] array = {1, 2};
    private OperationArray operationArray;

    @Before
    public void setup() {
        operationArray = new OperationArray(array);
        System.out.println("@Before");
    }

    @Test
    public void testGetArray() {
//        operationArray = new OperationArray(array);
        assertEquals(array, operationArray.getArray());
    }
}