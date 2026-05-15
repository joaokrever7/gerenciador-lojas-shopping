public class Principal {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            int opcaoUsuario = Teclado.leInt("Digite sua opcao: ");
            if (opcaoUsuario == 1) {
                pass;
            } else if (opcaoUsuario == 2) {
                pass;
            } else if (opcaoUsuario == 3) {
                continuar = false;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
