**README.md - Projeto de Ordenação em Java**

## Descrição do Projeto
Este projeto implementa três algoritmos de ordenação em Java: Bubble Sort, Insertion Sort e Quick Sort. Esses algoritmos são utilizados para organizar elementos em uma determinada ordem, facilitando a busca e a manipulação de dados em uma variedade de contextos.

## Estrutura do Projeto
O projeto contém três classes principais para cada algoritmo de ordenação:

### Classe `InsertionSort` 
Esta classe implementa o algoritmo de ordenação Insertion Sort. Ela possui métodos para exibir o vetor e ordená-lo passo a passo.

```java
package estruturasOrdenacao;

public class InsertionSort {
    // Métodos e atributos da classe InsertionSort (anteriormente definidos)
}
```

### Classe `ResultadoInsertionSort` 
Esta classe contém o método `main` para demonstrar o uso da classe `InsertionSort`. Ela cria um vetor de inteiros com 20 elementos e realiza a ordenação utilizando o `InsertionSort`. O vetor de exemplo está preenchido com valores arbitrários.

```java
package resultados;

import estruturasOrdenacao.InsertionSort;

public class ResultadoInsertionSort {
    public static void main(String[] args) {
        // Código para utilizar a classe InsertionSort (anteriormente definido)
    }
}
```

### Classe `BubbleSort` 
Esta classe implementa o algoritmo de ordenação Bubble Sort. Ela possui métodos para exibir o vetor e ordená-lo passo a passo.

```java
package estruturasOrdenacao;

import java.util.Arrays;

public class BubbleSort {
    // Métodos e atributos da classe BubbleSort (anteriormente definidos)
}
```

### Classe `ResultadoBubbleSort` 
Esta classe contém o método `main` para demonstrar o uso da classe `BubbleSort`. Ela cria um vetor de inteiros com 20 elementos e realiza a ordenação utilizando o `BubbleSort`. O vetor de exemplo está preenchido com valores arbitrários.

```java
package resultados;

import estruturasOrdenacao.BubbleSort;

public class ResultadoBubbleSort {
    public static void main(String[] args) {
        // Código para utilizar a classe BubbleSort (anteriormente definido)
    }
}
```

### Classe `QuickSortDefinitivo` 
Esta classe implementa o algoritmo de ordenação Quick Sort. Ela possui métodos para exibir o vetor, trocar elementos e realizar a ordenação recursiva.

```java
package estruturasOrdenacao;

public class QuickSortDefinitivo {
    // Métodos e atributos da classe QuickSortDefinitivo (anteriormente definidos)
}
```

### Classe `ResultadoQuickSortDefinitivo` 
Esta classe contém o método `main` para demonstrar o uso da classe `QuickSortDefinitivo`. Ela cria um vetor de inteiros com 20 elementos e realiza a ordenação utilizando o `QuickSortDefinitivo`. O vetor de exemplo está preenchido com valores arbitrários.

```java
package resultados;

import estruturasOrdenacao.QuickSortDefinitivo;

public class ResultadoQuickSortDefinitivo {
    public static void main(String[] args) {
        // Código para utilizar a classe QuickSortDefinitivo (anteriormente definido)
    }
}
```

## Como Utilizar
1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/ordenacao-java.git
   ```

2. **Importe as Classes:**
   - Importe as classes correspondentes ao algoritmo de ordenação desejado para utilizar o código no seu projeto.

   ```java
   import estruturasOrdenacao.InsertionSort;
   import resultados.ResultadoInsertionSort;

   public class Main {
       public static void main(String[] args) {
           // Exemplo de utilização do Insertion Sort
           int[] vetorInsertionSort = {4, 2, 7, 1, 3};
           InsertionSort insertionSort = new InsertionSort();
           insertionSort.ordenar(vetorInsertionSort);
       }
   }
   ```

   ```java
   import estruturasOrdenacao.BubbleSort;
   import resultados.ResultadoBubbleSort;

   public class Main {
       public static void main(String[] args) {
           // Exemplo de utilização do Bubble Sort
           int[] vetorBubbleSort = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
           BubbleSort bubbleSort = new BubbleSort(vetorBubbleSort, vetorBubbleSort.length);
           bubbleSort.ordenar(vetorBubbleSort.length, 0);
       }
   }
   ```

   ```java
   import estruturasOrdenacao.QuickSortDefinitivo;
   import resultados.ResultadoQuickSortDefinitivo;

   public class Main {
       public static void main(String[] args) {
           // Exemplo de utilização do Quick Sort
           int[] vetorQuickSort = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
           QuickSortDefinitivo quickSort = new QuickSortDefinitivo();
           quickSort.ordenar(vetorQuickSort, 0, vetorQuickSort.length - 1);
       }
   }
   ```

## Contribuições
Contribuições são bem-vindas! Se você encontrar problemas ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença
Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

---

**Autor:** Nicolas Blaskovski, Thomas Pickeler 
**Última Atualização:** 13/11/2023
