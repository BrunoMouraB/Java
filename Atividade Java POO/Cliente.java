package POO;

public class Cliente {
	
	private String nomeClienteCompleto;
	private String enderecoCliente;
	private String idadeCliente;
	private String cpfCliente;
	
	public Cliente (String nomeC,String enderecoC,String idadeC,String cpfC)
	//public Cliente (String nomeC, String enderecoC, int idadeC, int cpfC)
	
	{
		
		nomeClienteCompleto = nomeC;
		enderecoCliente = enderecoC;
		idadeCliente = idadeC;
		cpfCliente = cpfC;
		
	}
	
	public String getDadosClienteCompleto()
	//public String getNomeCliente()
	
	{
		String DadosClienteCompleto = nomeClienteCompleto+ " " +enderecoCliente+ " " +idadeCliente+ " " +cpfCliente;
		return DadosClienteCompleto;
		
	}
	
	
	}

