import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        DispensadorDeSenhas dispensador = new DispensadorDeSenhas();
        Controle controle = new Controle();
        Painel painel = new Painel ();

        while (true) {
            System.out.println("Escolha uma opção:\n1- Retirar Senha\n2- Usar Controle\n3- Sair");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    dispensador.retiraSenha(scanner);
                    break;
                case "2":
                    controle.botoesControle(scanner, painel);
                    painel.exibir();
                    break;
                case "3":
                    System.out.println("Sair");
                    scanner.close();
                default:
                    System.out.println("Opção Inválida");
                    scanner.close();
            }
        }
    }
}