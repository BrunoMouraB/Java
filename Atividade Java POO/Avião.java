package POO;

public class Avi�o {
	private String modeloAvi�o;
	private String capacidadeAvi�o;
	private String destinoAvi�o;
	private String horarioPartida;
	private String dura��oVoo;
	
	
	
	public Avi�o (String modelo,String capacidade,String destino,String horario, String dura��o)

	
	{
		
		modeloAvi�o = modelo;
		capacidadeAvi�o = capacidade;
		destinoAvi�o = destino;
		horarioPartida = horario;
		dura��oVoo =dura��o;
		
		
	}
	
	public String getDadosDoVoo()
	
	
	{
		String DadosDoVoo = modeloAvi�o+ " " +capacidadeAvi�o+ " " +destinoAvi�o+ " " +horarioPartida+ " " +dura��oVoo;
		return DadosDoVoo;
		
	}
	
	
	}



