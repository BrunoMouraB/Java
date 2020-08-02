package POO;

public class Patinete {

    private String tamanho; //cor;
    private String marca;
    private boolean status;
    private int velocidade;
    private int incrementoVelocidade;

    public Patinete (String tam, String m, boolean s, int vel, int incrementoVel) {

    	tamanho = tam;
        marca = m;
        status = s;
        velocidade = vel;
        incrementoVelocidade = incrementoVel;

    }
    public String mostrarDados() {
        String statusPatinete;

        if (status == false) {
            statusPatinete = "Patinete parado";
        }
        else {
            statusPatinete = "Pariente em movimento";
        }
        String informacao = "Tamanho: " + tamanho + "\nMarca: " + marca + "\nStatus: " + statusPatinete + "\nVelocidade Atual: " + velocidade + " KM/h" + "\nIncremento Velocidade: " + incrementoVelocidade+" KM/h";
        return informacao;
    }


    public String andar() {
        status = true;
        String statusP = null;
        if (status == true) {
         statusP = "Patinete esta andando";
        }
        velocidade = velocidade + incrementoVelocidade;
        String informacao = "Tamanho: " + tamanho + "\nMarca: " + marca + "\nStatus: " + statusP + "\nVelocidade Atual: " + velocidade + " KM/h";
        return informacao;


    }


}