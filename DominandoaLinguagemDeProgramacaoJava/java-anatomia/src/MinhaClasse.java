public class MinhaClasse {
    public static void main(String[] args) {

        String preimeiroNome = "Heliel";
        String sobreNome = "William";
        String nomeCompleto = nomeCompleto(preimeiroNome, sobreNome);

        System.out.println(nomeCompleto);

    };

    public static String nomeCompleto (String primeiroNome, String sobreNome){
            return "Resultado do metodo = " + primeiroNome.concat(" ").concat(sobreNome);
    };
}
