import java.util.Scanner;

public class TrafficLight {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int numero;
    

    
    while (true) {
      numero = scanner.nextInt();
      if (numero == 1) {
        System.out.println("Pare! O sinal esta vermelho.");
        break;
      }
      if (numero == 2) {
        System.out.println("Atencao! O sinal esta amarelo.");
        break;
      }
      if (numero == 3) {
        System.out.println("Siga em frente! O sinal esta verde.");
        break;
      }
      if (numero == 8) {
        System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        break;
      } 
      if (numero == -1) {
        System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        break;
      } 
      
      else {
        System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
      }
  }
}
}