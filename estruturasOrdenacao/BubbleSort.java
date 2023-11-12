package estruturasOrdenacao;

import java.util.Arrays;
public class BubbleSort
{
    private int tamanho;
    private int[] array;
    public BubbleSort(int[] array, int tamanho)
    {
        this.array = array;
        this.tamanho = tamanho;
    }
    public void ordenar(int tamanho, int numero)
    {
        int analisando = array[numero];
        if(analisando > array[numero + 1])
        {
            array[numero] = array[numero + 1];
            array[numero + 1] = analisando;
            analisando++;
            
            System.out.println("Estado atual do array: " + Arrays.toString(array));

            ordenar(1, analisando);
        }
        else
        {


        }

    }






}
