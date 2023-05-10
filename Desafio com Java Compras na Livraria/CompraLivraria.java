// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

/*import java.util.Scanner;

public class ComprasLivraria {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
    Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
    scanner.nextLine(); // Limpa o buffer do teclado
    Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

    //TODO: Considerando os objetos "livro1" e "livro2", calcule o valor total da compra.
    //TODO: Considerando os objetos "livro1" e "livro2", calcule o número de livros comprados.

    //TODO: Imprima as linhas necessárias conforme a saída deste desafio.
  }
  
  static class Livro {
    String nome;
    double preco;
    int quantidade;
    
    Livro(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
  }
}*/

import java.text.DecimalFormat;
import java.util.Scanner;


public class CompraLivraria {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    

    double total = 0;
    int quantidadeTotal = 0;

    DecimalFormat formatter = new DecimalFormat("#0.00");

    Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
    scanner.nextLine();
    Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

    total += livro1.preco*livro1.quantidade;
    quantidadeTotal += livro1.quantidade;

    total += livro2.preco*livro2.quantidade;
    quantidadeTotal += livro2.quantidade;

    System.out.println("Valor total da compra: " + (formatter.format(total)));

    System.out.println("Numero de livros comprados: " + quantidadeTotal);
    System.out.println("Obrigado por comprar na nossa livraria!");

  }

  static class Livro {
    String nome;
    double preco;
    int quantidade;
    

    Livro(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
  }
}