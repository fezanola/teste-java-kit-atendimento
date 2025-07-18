//Sem chat:
/*import java.util.Scanner;

public class DispensadorDeSenhas {
    int qntSenhasBobina = 100;
    int senhaBobina = 1;

    public static void dispensadorDeSenhas(String[] args) {

        Scanner retirarSenhya = new Scanner ("Retirar senha? y/n");
        String retirada = retirarSenha.findInLine ("y");
        if (retirada == "y") {
            qntSenhasBobina--;
            System.out.println("Sua senha é: " senhaBobina);
            senhaBobina++;
}*/

//Com chat:
import java.util.Scanner;

public class DispensadorDeSenhas {
    static int qntSenhasBobina = 100;
    static int senhaBobina = 1;

    public static void main(String[] args) {
        Scanner retirarSenha = new Scanner (System.in);
        System.out.println("Retirar senha? y/n: ");
        String retirada = retirarSenha.nextLine();

        if (retirada.equals("y")) {
            if (qntSenhasBobina > 0) {
                qntSenhasBobina--;
                System.out.println("Sua senha é: "+ senhaBobina);
                senhaBobina++;
            } else {
                System.out.println("As senhas acabaram");
            }
        } else {
            System.out.println("Operação cancelada.");
        }
        retirarSenha.close();
    }
}