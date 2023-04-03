import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicoImpressao ps = new ServicoImpressao();
        //ServicoImpressaoString ps = new ServicoImpressaoString();
        System.out.println("Quantidade? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.adicionarValor(value);
        }
            ps.imprime();
            System.out.println("Primeiro: " + ps.primeiro());
            sc.close();
    }
}
