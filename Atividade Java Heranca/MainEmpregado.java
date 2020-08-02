package Heranca;

public class MainEmpregado {

public static void main(String[] args) {
    	
	Empregado parceiro = new Empregado ("Mariane Moura", "Rua Nove de Julho", "(11) 98754-1122", 002, 1500, 500);
                                                             // 002 cod cliente R$ 1500 salario Imposto 500

    System.out.println(parceiro.getNome());
    System.out.println(parceiro.getEndereco());
    System.out.println(parceiro.getTelefone());
    System.out.println(parceiro.getCodigoSetor());
    System.out.println(parceiro.getSalarioBase());
    System.out.println(parceiro.getImposto());
    

    parceiro.obterSaldo();
   	

      
}

}

