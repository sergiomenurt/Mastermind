package Mastermind;

public class Tablero {

        private Tablero(){}

        Tablero  instancia = new Tablero();

        private static Tablero instance = null;

        public static Tablero getInstance(){

            if( instance == null){

                instance = new Tablero();

            }
            return instance;
    }

    public String cifraAleatorio;

    public String cifraSecuencia;

    public String cifraPista;

    public String getCifraAleatorio() {
        return cifraAleatorio;
    }

    public void setCifraAleatorio(String cifraAleatorio) {
        this.cifraAleatorio = cifraAleatorio;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }
}
