package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

/*PROGRAMA QUE EL USUARIO INTRODUCIRA UN VALOR EN CENTIMETROS Y SE IMPRIMIRA UN VALOR EN PULGADAS*/

    public static void cmApulg(float cm, double pulg){
       System.out.print("La conversion de " + cm + " cm a pulgadas es de " + pulg);

    }

    public static void main(String[] args)throws Exception {
float cm;
         double pulg =0.393701;
        BufferedReader a =  new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Introduzca un valor en centimetros que sea par: ");
        cm = Float.parsefloat(a.readLine());

        pulg = cm * pulg;
        cmApulg(cm , pulg);



    }
}
