package Mastermind;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = Tablero.getInstance();

        Funciones.generarAleatorio(tablero);

        for (int i=0; i<10; i++) {

            Funciones.pedirSecuencia(tablero);
            if (Funciones.comprobarSecuencia(tablero.getCifraAleatorio(),tablero.getCifraSecuencia())){

                Funciones.mostrarPista(tablero);
                break;

            }else{
                Funciones.mostrar( "GANASTE!");
            }
        }

    // FIN

        Funciones.mostrar("FIN");

    }
}
