package resultados;

import estruturasOrdenacao.InsertionSort;

public class ResultadoInsertionSort
{
    public static void main(String[] args)
    {
        int[] array = new int[20];

        array[0] = 49;
        array[1] = 15;
        array[2] = 40;
        array[3] = 27;
        array[4] = 20;
        array[5] = 19;
        array[6] = 50;
        array[7] = 2;
        array[8] = 12;
        array[9] = 28;
        array[10] = 49;
        array[11] = 44;
        array[12] = 9;
        array[13] = 59;
        array[14] = 18;
        array[15] = 5;
        array[16] = 30;
        array[17] = 6;
        array[18] = 7;
        array[19] = 28;

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.ordenar(array);
    }
}
