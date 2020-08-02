package POO;

public class DadosProducto {
	public static void main (String args[]) {
		Producto producto1 = new Producto ("Notbook ", 123, true);
		Producto producto2 = new Producto ("TV ", 321, false);

        System.out.println(producto1.mostrarDados());
        System.out.println(producto1.verificarStatusPedido());

        
        System.out.println(producto2.mostrarDados());
        System.out.println(producto2.verificarStatusPedido());


    }
}


