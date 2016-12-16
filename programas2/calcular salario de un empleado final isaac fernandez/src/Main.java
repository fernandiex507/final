import sun.awt.image.SurfaceManager;

import java.io.*;

public class Main {

    private static String si;

    public static void main(String[] args) throws IOException {
        String nombre;
        int continuar;
      String comotrabaja;
        Float horastrabajadas;
        Float salarioporhoras;
        Float salariototal = null;


do {


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    FileWriter archivo=new FileWriter("C:\\Users\\user\\IdeaProjects\\calcular salario de un empleado\\archivo.txt");
    PrintWriter escribir=new PrintWriter(archivo);
    PrintWriter escribir2=new PrintWriter(archivo);
    System.out.println("Nombre completo del trabajador: ");

            nombre=bf.readLine();


    String cadena="El nombre es: "+nombre;
    escribir.println(cadena);

        System.out.println("trabaja por Horas? si o no");
        comotrabaja=bf.readLine();
       switch (comotrabaja){
           case "si":
        System.out.println("Horas trabajadas: ");
        horastrabajadas= Float.valueOf(bf.readLine());
               String cadenaa="Horas trabajadas: "+horastrabajadas;
               escribir.println(cadenaa);
        System.out.println("Salario base por horas: ");
        salarioporhoras= Float.valueOf(bf.readLine());
               String cadena2="El salario por horas es: "+salarioporhoras;
               escribir.println(cadena2);
        salariototal=horastrabajadas*salarioporhoras;
        System.out.println("Salario total: "+salariototal);
               String cadena3="El salario total es : "+salariototal;
               escribir.println(cadena3);
        break;

           case"no":
               if(comotrabaja!="no"){
            System.out.println("Dias trabajados: ");

            horastrabajadas= Float.valueOf(bf.readLine());
                   String datos="Dias trabajados: "+horastrabajadas;
                   escribir2.println(datos);
            System.out.println("Salario base por dia: ");
            salarioporhoras= Float.valueOf(bf.readLine());
                   String datos1="Salario base por dia: "+salarioporhoras;
                   escribir2.println(datos1);

            salariototal=horastrabajadas*salarioporhoras;
            System.out.println("Salario total: "+salariototal);
                   String datos2="Salario Total: "+salariototal;
                   escribir2.println(datos2);
               }
               else {
                   System.out.println("ha ingresado una letra y no un numero");
               }
            System.out.println();
           
            
        break;
           default:
               System.out.println("Error de lectura de datos");
        }

        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Salario total: "+salariototal);
        System.out.println();
    System.out.println("para continuar marque 0, para finalizar marque 1:");



    archivo.close();
    continuar= Integer.parseInt(bf.readLine());
    int i;
    for (i=1; i<=25; i++)
        System.out.println(' ');
}while ( continuar==0);
}}
