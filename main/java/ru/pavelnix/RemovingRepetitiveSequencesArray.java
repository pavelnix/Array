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
     * Метод удаляет повторяющую последовательность чисел из массива,
     * если последовательность больше либо равна lengthRepetitiveSequences
     * Например при lengthRepetitiveSequences = 1
     * 1 1 2 3 4 4 -> 2 3
     *
     * при lengthRepetitiveSequences = 2
     * 1 1 2 3 3 4 4 4-> 1 1 2 3 3
     *
     * @param lengthRepetitiveSequences - длина последовательности
     */
    public void actionV2(int lengthRepetitiveSequences) {
        int[] tempArray;
        int flag = 1; //флаг записи в новый массив
        int j = 0; //счетчик по новому массиву
        int sublength = 1; //счетчик длины подпоследовательности

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (flag == 0) {
                    flag = 1;
                } else {
                    for (int k = 1; k <= sublength; k++) {
                        array[j++] = array[i];
                    }
                }
                sublength = 1;
            } else {
                sublength++;
                if (sublength > lengthRepetitiveSequences) {
                    flag = 0;
                }
            }
        }
        if (flag == 1) {
            for (int k = 1; k <= sublength; k++) {
                array[j++] = array[length - 1];
            }
        }

        tempArray = new int[j];
        System.arraycopy(array, 0, tempArray, 0, j);
        array = tempArray;
    }
}
