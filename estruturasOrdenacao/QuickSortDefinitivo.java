package estruturasOrdenacao;
public class QuickSortDefinitivo {

    public QuickSortDefinitivo()
    {

    }

    public void ordenar(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = quebrarVetor(vetor, inicio, fim);

            ordenar(vetor, inicio, indiceParticao - 1);
            ordenar(vetor, indiceParticao + 1, fim);
        }
    }

    public int quebrarVetor(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
                mostrarVetor(vetor);
            }
        }

        trocar(vetor, i + 1, fim);
        mostrarVetor(vetor);
        return i + 1;
    }

    public void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
}
