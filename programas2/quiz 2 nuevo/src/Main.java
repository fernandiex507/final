import java.io.*;

import static com.sun.deploy.trace.Trace.flush;

public class Main {

    public static void main(String[] args) throws IOException {

        String name="";
        int cantidad=0,i=0,conteo=0;
        int velocidades=0,suma=0,multa=0,velocidad=0;
        FileWriter archivo=new FileWriter("C:\\Users\\user\\IdeaProjects\\quiz 2 nuevo\\ATTT.txt");
        PrintWriter escribir=new PrintWriter(archivo);

        BufferedReader nombre=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("escribe el nombre: ");
        try {
            name=(nombre.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("cuantas velocidades vas a introducir: ");
        try {
            cantidad= Integer.parseInt(nombre.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(i=1;i<=cantidad;i++){
            System.out.println("Dame velocidades: ");



            try {
                velocidades=Integer.parseInt(nombre.readLine());
                //velocidades++;
                suma+=velocidades;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("el nombre de la persona es: "+name);
        System.out.println("velocidades: "+cantidad);
        System.out.println("total: "+(float) velocidades);

        if(velocidades>60){
            System.out.println("tiene una multa de B/60.00");
            multa=60;
        }

        else if(velocidades>160){
            System.out.println("tiene una multa de B/50.00");
        }
        else{
            System.out.println("no tiene multa");

        }
        String cadena ="nombre de la persona: "+name;
        String larg = "velocidad total: "+suma;

        String mult="la multa es de: "+multa;
        escribir.println(cadena);
        escribir.println(larg);
        escribir.println(mult);
        archivo.close();

    }

}

