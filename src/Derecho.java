import java.util.Scanner;

public class Derecho implements Runnable {


    public Derecho(String cadena)
    {
        number++;
        this.id=number;
        this.linea=cadena;
    }


    static int number=0;
    int id=0;
    static final String tipo="Derecho: ";
    private String linea;

    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * metodo para imprimir una cadena ingresada por el usuario
     */
    public void imprimirCadena()
    {

        char[] chars=linea.toCharArray();
        for (int i=0;i<chars.length;i++)
        {
            System.out.println(tipo+id+": "+chars[i]);
        }
    }
    public boolean revisarOracion(String cadena)
    {
        int cont=0;
        char[] chars=cadena.toCharArray();
        for (int i=0;i<chars.length;i++)
        {
            if(chars[i]==' ')
            {
                System.out.println(chars[i]);
                cont++;
            }


        }
        if(cont>=3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * implementando metodo run
     */
    @Override
    public void run() {

        imprimirCadena();

    }
}
