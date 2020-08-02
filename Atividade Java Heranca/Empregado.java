package Heranca;

public class Empregado extends Pessoa {
	private int  codigoSetor;
	private int  salarioBase;
	private int imposto;
	
	 public Empregado (String nome, String endereco, String telefone, int  codigoSetor, int  salarioBase, int imposto) // construtor 
	 {
		 super (nome, endereco, telefone);
		 this.codigoSetor = codigoSetor;
		 this.salarioBase = salarioBase;
		 this.imposto = imposto;
}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public void obterSaldo() {

        double valor;
        valor = salarioBase - imposto;
        System.out.println("O salario a receber é: " +valor);
	  }

	  }