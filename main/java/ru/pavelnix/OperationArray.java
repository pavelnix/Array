package ru.pavelnix;

/**
 * Класс обработки массива
 */
public class OperationArray {
    /**
     * Сам массив
     */
    private int[] array;

    /**
     * Конструктор
     *
     * @param array - массив
     */
    public OperationArray(int[] array) {
        this.array = array;
    }

    /**
     * Геттер
     *
     * @return - возвращает массив
     */
    public int[] getArray() {
        return array;
    }
}
