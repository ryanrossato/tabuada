import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo à Tabuada!");

        while (!entrada.hasNextInt()) {
            System.out.println("Erro: Por favor, digite um número inteiro.");
            entrada.next(); // Limpa o token inválido do scanner
        }

        System.out.println("A tabuada de qual número você deseja? ");
        int tabuada = entrada.nextInt();

        // Loop da tabuada
        System.out.println("Resultado:");
        for(byte i = 0 ; i <=100 ; i++){
            System.out.println(tabuada+"x"+i+": "+tabuada*i);
        }
        entrada.close();
    }
}
