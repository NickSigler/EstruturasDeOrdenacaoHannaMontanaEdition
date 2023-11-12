package estruturasOrdenacao;
public class InsertionSort
{
    public InsertionSort()
    {

    }
    public void mostrarVetor(int[] vetor)
    {
        String texto = "";

        for(int item: vetor)
        {
            if(vetor[0] == vetor[vetor.length - 1] )
            {
                texto += item;
            }
            else
            {
                texto += "," + item;
            }

        }
        System.out.println(texto);
    }
    public void ordenar(int[] vetor)
    {
        int indice = vetor.length;
        for (int i = 1; i < indice; ++i)
        {
            int itemAtual = vetor[i];
            int j = i - 1;


            while (j >= 0 && vetor[j] > itemAtual) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = itemAtual;
            mostrarVetor(vetor);
        }


    }






}
