package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM, será compilado pelo Java

        // Dados não primitivos: String, Array, Class, enum
        // Objetivo da aula: criar um ninja e atribuir métodos a ele.

        String nome = "Naruto Uzumaki";
        System.out.println("Nome do ninja: " + nome);

        String nomeUpperCase = nome.toUpperCase();  // Método uppercase - Tudo em MAIÚSCULO
        System.out.println("Nome do ninja em MAIÚSCULO: " + nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        System.out.println("\nNome da aldeia: " + aldeia);

        String aldeiaLowerCase = aldeia.toLowerCase();  // Método lowercase - Tudo em MINÚSCULO
        System.out.println("Nome da aldeia MINÚSCULO: " + aldeiaLowerCase);

    }
}
