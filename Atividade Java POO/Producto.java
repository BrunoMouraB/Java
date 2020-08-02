package POO;

public class Producto {
    private String nomeProduto; 
    private int numeroPedido; 
    private boolean statusPedido; 

    public Producto (String p, int np, boolean statusP) 
    {
    	nomeProduto = p;
    	numeroPedido = np;
    	statusPedido = statusP;
    }

    public String mostrarDados () {
        String informacoes = "Produto: "+nomeProduto+" | Número do pedido: "+numeroPedido;
        return informacoes;
    } 

    public String verificarStatusPedido () {

        String verificacao;
        if (statusPedido == true) 
        {
            verificacao = "Produto disponivel.";
        }

        else {
            verificacao = "Produto indisponivel.";
        }

        return verificacao;
    }
}