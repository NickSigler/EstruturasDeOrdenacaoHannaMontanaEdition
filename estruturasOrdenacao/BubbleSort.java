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
    public void ordenar(int tamanho, int numero, int contador)
    {
        
        int analisando = array[numero];
        if(numero == array.length - 1)
        {
            ordenar(tamanho, 0, 0);
        }
        else
        {
            
            if(analisando > array[numero + 1])
            {
                array[numero] = array[numero + 1];
                array[numero + 1] = analisando;
                numero++;

                System.out.println("Estado atual do array: " + Arrays.toString(array));

                ordenar(1, numero, contador);
            }
            else if(contador == array.length - 1)
            {
                System.out.println("Vetor ordenado!");
            }
            else
            {

                numero++;
                contador++;
                ordenar(tamanho, numero, contador);
                

            }
        }
        
        
        

    }






}
