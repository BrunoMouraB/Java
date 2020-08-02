package POO;

public class DadosPatinete {
	public static void main(String[] args) {

        Patinete patinete = new Patinete("38", "Adidas", false, 0 , 30);
        System.out.println(patinete.mostrarDados());
        System.out.println("\n");
        System.out.println(patinete.andar());

    }
}

