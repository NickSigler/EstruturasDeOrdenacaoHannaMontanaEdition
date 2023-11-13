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
        int contador = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (i >= array.length - 1)
            {
                break;
            }
            else if (array[i] <= array[i +1])
            {
                contador++;
            }
            else
            {
                contador = 0;
            }

        }
        if(contador == array.length - 1)
        {
            System.out.println("Array ordenada");
        }
        else if(numero == array.length - 1)
        {
            ordenar(tamanho, 0);
        }
        else {

            if (analisando > array[numero + 1]) {
                array[numero] = array[numero + 1];
                array[numero + 1] = analisando;
                numero++;

                System.out.println("Estado atual do array: " + Arrays.toString(array));

                ordenar(1, numero);
            }
            else
            {

                numero++;
                ordenar(tamanho, numero);


            }

        }


        
        
        

    }






}
