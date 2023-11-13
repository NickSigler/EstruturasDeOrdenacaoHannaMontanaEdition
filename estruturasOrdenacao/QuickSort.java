package estruturasOrdenacao;

public class QuickSort
{
    public QuickSort()
    {
    }
    public void ordenar(int[] vetor, int troca, int analisa)
    {
        int troca1 = vetor[troca];
        int analisa1 = vetor[analisa];
        int pivot = vetor[vetor.length - 1];

        if(analisa == vetor.length - 1)
        {

            int guardar = vetor[troca];
            vetor[troca] = vetor[vetor.length - 1];
            vetor[analisa] = guardar;

            mostrarVetor(vetor);

            quebrarVetor(vetor, troca);

        }
        else
        {
            if (analisa1 < pivot)
            {
                int guardar = vetor[troca];
                vetor[troca] = vetor[analisa];
                vetor[analisa] = guardar;

                troca++;
                analisa++;

                mostrarVetor(vetor);

                ordenar(vetor, troca, analisa);
            }
            else
            {
                analisa++;

                mostrarVetor(vetor);

                ordenar(vetor, troca, analisa);
            }
        }
    }

    public void quebrarVetor(int[] vetor, int posicaoPivot)
    {
        int []vetorMenor;
        int []vetorMaior;
        int contador = 0;
        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == vetor[posicaoPivot])
            {
                vetorMenor = new int[i + 1];
                for(int j = i; i < vetor.length; i++)
                {
                    contador++;


                }
                vetorMaior = new int[contador - 1];


                for(int x = 0; x < vetorMenor.length; x++)
                {
                    vetorMenor[x] = vetor[x];
                }
                for(int y = posicaoPivot; y < vetor.length; y++ )
                {
                    for(int w = 0; w < vetorMaior.length; w++)
                    {
                        vetorMaior[w] = vetor[y + 1];
                        y++;
                    }

                }
                if(verificarVetor(vetorMenor) == true)
                {
                    System.out.println("Vetor esta ordenado");
                }
                else
                {
                    ordenar(vetorMenor, 0, 0);
                }
                if(verificarVetor(vetorMaior) == true)
                {
                    System.out.println("Vetor esta ordenado");
                }
                else
                {
                    ordenar(vetorMaior, 0, 0);
                }

                mostrarVetor(vetorMaior);
                mostrarVetor(vetorMenor);
            }
        }
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
                texto += item + " |";
            }

        }
        System.out.println(" Vetor - [" + texto + "]");
    }

    public boolean verificarVetor(int[] vetor)
    {
        int contador = 0;
        for(int i = 0; i < vetor.length; i++)
        {
            if (i == vetor.length - 1)
            {
                break;
            }
            else if (vetor[i] <= vetor[i +1])
            {
                contador++;
            }
            else
            {
                contador = 0;
            }

        }
        if(contador == vetor.length - 1)
        {
            return true;
        }
        return false;
    }

}
