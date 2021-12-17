package Mastermind;

public class Funciones {



    public static boolean generarAleatorio(Tablero tablero) {

        tablero.setCifraAleatorio("45463");
        return true;

    }

    public static boolean pedirSecuencia(Tablero tablero){
        return false;
        /**
         * @param cifraAleatorio cifra generada
         * @param cifra introducida por el jugador
         * @return
         */

    }

    public static boolean comprobarSecuencia(String cifraAleatorio, String cifraSecuencia) {

        // comprobar

        return cifraAleatorio.equals(cifraSecuencia);
    }

    public static void mostrar(String mensaje){


    }

    public static String mostrarPista(Tablero tablero) {

        String aleatorio = new String(Tablero.getInstance().getCifraAleatorio());
        String secuencia = new String(Tablero.getInstance().getCifraSecuencia());

        tablero.setCifraPista("-----");

        String pista = new String(tablero.getCifraPista());

        for(int i =0;i<5;i++){

            if(aleatorio.charAt(i)==secuencia.charAt(i)){

                char caracter = '0';
                pista.charAt(i)=caracter;


            }else{

            for(int j=0;j<5;j++){

                char caracter = 'X';
                pista.charAt(i)=caracter;
                break;


            }
        }



        return null;
    }
}
