public class Painel {
    static int senhaPainel = 1, guichePainel = 1;
    static boolean modoSenha = true;

    static void avancarValor() {
       if(modoSenha) {
           if (senhaPainel <= DispensadorDeSenhas.senhaBobina) {
               senhaPainel++;
           }
       } else {
           if (guichePainel <= 9) {
               guichePainel++;
           } else {
               guichePainel = 1;
           }
       }
    }

    static void retrocederValor() {
        if(modoSenha) {
            if (senhaPainel > 1) {
                senhaPainel--;
            }
        } else {
            if (guichePainel > 1) {
                guichePainel--;
            }
        }
    }

    static void alternarModo() {
        modoSenha = !modoSenha;
        System.out.println("Modo alterado para: " + (modoSenha ? "Guichê" : "Senha"));
    }

    static void exibir() {
        System.out.println("Senha: " + senhaPainel + "Guichê: " + guichePainel);
    }
}