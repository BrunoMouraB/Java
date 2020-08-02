package Heranca;

public class Main {

    public static void main(String[] args) {
    	
    	Fornecedor parceiro = new Fornecedor ("Mariane Moura", "Rua Nove de Julho", "(11) 98754-1122", 300, 200);
    	           

        System.out.println(parceiro.getNome());
        System.out.println(parceiro.getEndereco());
        System.out.println(parceiro.getTelefone());
        System.out.println(parceiro.getValorCredito());
        System.out.println(parceiro.getValorDivida());

        System.out.println("");
        parceiro.obterSaldo();

    }

}


