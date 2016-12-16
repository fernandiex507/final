import java.io.*;
import familia.gato;
import familia.perro;

public class Main {

    public static void main(String[] args) throws IOException {

        String eleccion = null;
        String nombre = null;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("elige una mascota");
        System.out.println("1.perro     2.gato");
        eleccion=br.readLine();
        if("1".equals(eleccion))
        {
        System.out.println("elige un nombre para tu perro");
            nombre=br.readLine();
        }

	    gato g1=new gato();
        perro p1=new perro();
        p1.setA("el nombre del gato es :"+nombre);
        p1.mostrar();

        g1.mostrar();
        g1.mostrar();



    }
}
