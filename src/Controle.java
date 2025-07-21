import java.util.Scanner;

public class Controle {
    static void botoesControle(Scanner scanner, Painel painel) {
        System.out.println("Qual botão deseja apertar?\nA- Avancar\nB- Chamar Novamente\nC- Retroceder\nAC- Alternar Senha/Guichê");
        String botao = scanner.nextLine().toUpperCase();

        switch (botao) {
            case "A" -> Painel.avancarValor();
            //case "B" -> botaoChamarNovamente = true;
            case "C" -> Painel.retrocederValor();
            case "AC" -> Painel.alternarModo();
            default -> System.out.println("Escolha uma opção válida");
        }
    }
}