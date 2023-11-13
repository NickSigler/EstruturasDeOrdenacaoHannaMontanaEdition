**README.md - Projeto InsertionSort**

## Descrição do Projeto
Este projeto implementa o algoritmo de ordenação Insertion Sort em Java. O Insertion Sort é um algoritmo de ordenação simples que percorre uma lista e constrói uma sequência ordenada de elementos um de cada vez. A cada passo, o algoritmo pega um elemento da lista e o compara com os elementos já ordenados, movendo-os para a posição apropriada e inserindo o elemento na posição correta.

## Estrutura do Projeto
O projeto contém 6 classes principais:

### Classe `InsertionSort`
Esta classe implementa o algoritmo de ordenação Insertion Sort. Ela possui os seguintes métodos:

1. **`mostrarVetor(int[] vetor):`**
   - Exibe o conteúdo de um vetor no formato: `Vetor - [elemento1 | elemento2 | ... | elementoN]`.

2. **`ordenar(int[] vetor):`**
   - Ordena um vetor usando o algoritmo Insertion Sort.
   - Exibe o vetor a cada passo da ordenação.

### Classe `ResultadoInsertionSort`
Esta classe contém o método `main` para demonstrar o uso da classe `InsertionSort`. Ela cria um vetor de inteiros com 20 elementos e realiza a ordenação utilizando o `InsertionSort`. O vetor de exemplo está preenchido com valores arbitrários.

## Como Utilizar
1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/insertion-sort.git
   ```

2. **Importe as Classes:**
   - Importe a classe `InsertionSort` em seu código para utilizar o algoritmo de ordenação.

   ```java
   import estruturasOrdenacao.InsertionSort;

   public class Main {
       public static void main(String[] args) {
           // Crie um objeto InsertionSort
           InsertionSort insertionSort = new InsertionSort();

           // Exemplo de utilização:
           int[] vetor = {4, 2, 7, 1, 3};
           insertionSort.ordenar(vetor);
       }
   }
   ```

   - Importe a classe `ResultadoInsertionSort` para visualizar um exemplo de ordenação.

   ```java
   import resultados.ResultadoInsertionSort;

   public class Main {
       public static void main(String[] args) {
           ResultadoInsertionSort.main(args);
       }
   }
   ```


---

**Autor:** Nicolas Blaskovski, Thomas Pickler 
**Contato:** seu.email@example.com  
**Última Atualização:** 13/11/2023
