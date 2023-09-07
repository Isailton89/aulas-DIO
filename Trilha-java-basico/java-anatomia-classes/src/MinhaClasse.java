public class MinhaClasse {
    public static void main (String [] args) {
        //tipos de variaveis
        // String meuNome = "Isailton";
        // int anoFabricacao = 2022;
        // boolean verdadeira = true;

        String primeiroNome = "Isailton";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
