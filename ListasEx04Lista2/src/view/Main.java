package view;
import controller.ModificacaoCadastroController;

public class Main {
    public static void main(String[] args) throws Exception {
        ModificacaoCadastroController controller = new ModificacaoCadastroController();

        controller.novoCadastro(41, 60, 8000.00);

        controller.novoCadastro(31, 40, 5000.00);

        controller.novoCadastro(21, 30, 3000.00);
    }
}