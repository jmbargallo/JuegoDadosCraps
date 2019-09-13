
import  java.util.Random;

 public class Craps{


private static final Random numerosAletorios= new Random();

     private enum Estado { CONTINUA, GANO, PERDIO } ;


     private static final int D0S_UN0S = 2;
     private static final int TRES = 2;
     private static final int SIETE = 7;
     private static final int ONCE = 11;
     private static final int D0CE = 12;

public static void main (String [] args){

    int mipunto=0;
    Estado estadoJuego;

    int sumaDedados=tirardados();

    switch (sumaDedados)
    {
        case SIETE:
        case ONCE:
            estadoJuego =Estado.GANO;
            break;
        case D0S_UN0S:
        case D0CE:
            estadoJuego =Estado.PERDIO;
            break;
        default:
            estadoJuego =Estado.CONTINUA;
            mipunto=sumaDedados;
            System.out.println("Mi punto es: "+sumaDedados);
            break;
    }

    while (estadoJuego ==Estado.CONTINUA){

        sumaDedados=tirardados();

        if (sumaDedados == mipunto)
            estadoJuego =Estado.GANO;
        else if (sumaDedados==SIETE)
            estadoJuego =Estado.PERDIO;

    }

    if (estadoJuego ==Estado.GANO)
        System.out.println( "El jugador gana");
    else
        System.out.println("El jugador pierde");

     }

     private static int tirardados() {

    int dado1=1+numerosAletorios.nextInt(6);
    int dado2=1+numerosAletorios.nextInt(6);

    int suma=dado1+dado2;

         System.out.println( "Tirada dado 1 "+ dado1+" dado 2 "+dado2+" Suma "+suma);
        return suma;
     }


 }