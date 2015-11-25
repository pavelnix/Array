package ru.pavelnix;

/**
 * Класс обработки массива
 */
public class RemovingRepetitiveSequencesArray {
    /**
     * Сам массив
     */
    private int[] array;
    private int length;

    /**
     * Конструктор
     *
     * @param array - массив
     */
    public RemovingRepetitiveSequencesArray(int[] array) {
        this.array = array;
        this.length = this.array.length;
    }

    /**
     * Геттер
     *
     * @return - возвращает массив
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Метод удаляет повторяющую последовательность чисел из массива
     * Например
     * 1 1 2 3 4 4 -> 2 3
     */
    public void action() {

        int[] tempArray;
        int flag = 1; //флаг записи в новый массив
        int j = 0; //счетчик по массиву новому массиву

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (flag == 0) {
                    flag = 1;
                } else {
                    array[j++] = array[i];
                }
            } else {
                flag = 0;
            }
        }
        if (flag == 1) array[j++] = array[length - 1];

        tempArray = new int[j];
        System.arraycopy(array, 0, tempArray, 0, j);
        array = tempArray;
    }

    /**
     * Метод удаляет повторяющую последовательность чисел из массива,
     * если последовательность больше либо равна 3
     * Например
     * 1 1 2 3 3 4 4 4-> 1 1 2 3 3
     */
    public void actionV2() {
        int[] tempArray;
        int flag = 1; //флаг записи в новый массив
        int j = 0; //счетчик по массиву новому массиву
        int sublength = 1; //длина подпоследовательности

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {

                if (flag == 0) {
                    flag = 1;
                } else {
                    if (sublength == 2) {
                        array[j++] = array[i - 1];
                    }
                    array[j++] = array[i];
                }
                sublength = 1;
            } else {
                sublength++;
                if (sublength > 2) {
                    flag = 0;
                }
            }
        }
        if (flag == 1) array[j++] = array[length - 1];
        if (sublength == 2) array[j++] = array[length - 2];

        tempArray = new int[j];
        System.arraycopy(array, 0, tempArray, 0, j);
        array = tempArray;
    }
}
