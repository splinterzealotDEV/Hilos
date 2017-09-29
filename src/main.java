import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        String cadena="";
        String cadena2="";
        Derecho d=new Derecho("test");

        while(flag==false) {
            System.out.println("ingresar cadena: Ó ingresar salir para salir del programa");

            cadena = sc.nextLine();
            if(d.revisarOracion(cadena))
            {
                flag=true;
            }
            else if (cadena.equals("salir"))
            {
                System.out.println("saliendo");
                System.exit(-1);
            }
            else
            {
                System.out.println("la cadena ingresada no tiene cinco palabras, ingresar la cadena nuevamente");
            }
        }
        flag=false;
        while(flag==false) {
            System.out.println("ingresar cadena2: Ó ingresar salir para salir del programa");

            cadena2 = sc.nextLine();
            if(d.revisarOracion(cadena2))
            {
                flag=true;
            }
            else if (cadena2.equals("salir"))
            {
                System.out.println("saliendo");
                System.exit(-1);
            }
            else
            {
                System.out.println("la cadena ingresada no tiene cinco palabras, ingresar la cadena nuevamente");
            }
        }
        Thread t = new Thread(new Reves(cadena));
        Thread t2= new Thread(new Derecho(cadena2));

        t.start();
        t2.start();

    }
}
