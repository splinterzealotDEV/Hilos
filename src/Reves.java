import java.util.Scanner;

public class Reves implements Runnable {
    public Reves( String cadena)
    {
        number++;//aumentando el contador de hilos
        this.id=number;//asignando el id al hilo
        this.cadena=cadena;
    }
    int id;//variable para almacenar el id del hilo
    static int number=0;//variable para llevar una cuenta de cuantos hilos de este tipo se crean
    static final String tipo="Reves: ";
    private String cadena;

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     *metodo para voltear e imprimir una cadena ingresada por el usuario
     */
    public void voltear()
    {

        //array de char que almacena la cadena
        char[] chars=cadena.toCharArray();
        //StringBuffer aux=new StringBuffer();
        //volteando la cadena
        for(int i=chars.length-1;i>-1;i--)
        {
            System.out.println(tipo+id+": "+chars[i]);
            //aux.append(chars[i]);
        }
        //return aux.toString();
    }

    /**
     * implementando metodo run
     */
    public void run()
    {

        //System.out.println(voltear("una cadena vista al reves"));
        voltear();

    }

}
