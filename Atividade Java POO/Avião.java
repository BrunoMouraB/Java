package POO;

public class Avião {
	private String modeloAvião;
	private String capacidadeAvião;
	private String destinoAvião;
	private String horarioPartida;
	private String duraçãoVoo;
	
	
	
	public Avião (String modelo,String capacidade,String destino,String horario, String duração)

	
	{
		
		modeloAvião = modelo;
		capacidadeAvião = capacidade;
		destinoAvião = destino;
		horarioPartida = horario;
		duraçãoVoo =duração;
		
		
	}
	
	public String getDadosDoVoo()
	
	
	{
		String DadosDoVoo = modeloAvião+ " " +capacidadeAvião+ " " +destinoAvião+ " " +horarioPartida+ " " +duraçãoVoo;
		return DadosDoVoo;
		
	}
	
	
	}



