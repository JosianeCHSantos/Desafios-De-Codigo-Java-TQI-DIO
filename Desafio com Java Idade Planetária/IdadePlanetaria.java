// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

/*import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();

    //TODO: Crie as condições para calcular a idade equivalente de cada planeta.
    
    //TODO: Imprima a saída conforme descrito neste desafio.
    
    scanner.close();
  }
}*/

import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();

    // TODO: Crie as condições para calcular a idade equivalente de cada planeta.
    double idadePlaneta = 0.0;
    String nomePlaneta = "";

    if (planeta.equalsIgnoreCase("Marte")) {
      idadePlaneta = idadeTerrestre / 1.88;
      nomePlaneta = "Marte";
    } else if (planeta.equalsIgnoreCase("Venus")) {
      idadePlaneta = idadeTerrestre / 0.62;
      nomePlaneta = "Venus";
    } else if (planeta.equalsIgnoreCase("Jupiter")) {
      idadePlaneta = idadeTerrestre / 11.86;
      nomePlaneta = "Jupiter";
    } else {
      System.out.println("Planeta invalido.");
      System.exit(0);
    }
    // TODO: Imprima a saída conforme descrito neste desafio.
    System.out.printf("Idade equivalente em %s: %.2f anos", nomePlaneta, idadePlaneta);

    scanner.close();
  }
}