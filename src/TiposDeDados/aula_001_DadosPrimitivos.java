package TiposDeDados;

public class aula_001_DadosPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM, será compilado pelo Java

        // Dados Primitivos em Java
        // Objetivo da aula: criar um ninja

        int idade = 16;     // Valor máximo do tipo int: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        // O tipo long no valor deve ter um L no final
        long saldoBancario = 2147483648L;   // Valor máximo do Long: 9223372036854775807

        // Comando para mostrar para o usuário
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Saldo Bancário: " + saldoBancario);
    }
}
