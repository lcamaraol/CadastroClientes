package cadastroclientes;

public class CadastroClientes {    
    private static ControladorCliente controladorCliente = new ControladorCliente();
    private static GUITelaCadastro telaCadastro;
    private static CadastroClientes menu;
    private static ListagemClientes listagem;

    
    
    public static void main(String[] args) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ControladorCliente controladorCliente = new ControladorCliente();
                GUITelaCadastro telaCadastro = new GUITelaCadastro();
                Cadastro menu = new Cadastro(controladorCliente, telaCadastro, listagem);
                telaCadastro.setMenu(menu);
                menu.setVisible(true);
            }
        });
    }
    
    public static void adicionarCliente(Cliente cliente) {
        controladorCliente.adicionarCliente(cliente);
    }

    public static Cliente localizarCliente(String nome) {
        return controladorCliente.localizarCliente(nome);
    }

    public static boolean excluirCliente(String nome) {
        return controladorCliente.excluirCliente(nome);
    }
}


