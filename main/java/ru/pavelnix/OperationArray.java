package ru.pavelnix;

/**
 * ����� ��������� �������
 */
public class OperationArray {
    /**
     * ��� ������
     */
    private int[] array;

    /**
     * �����������
     *
     * @param array - ������
     */
    public OperationArray(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * ������
     *
     * @return - ���������� ������
     */
    public int[] getArray() {
        return array;
    }
}
