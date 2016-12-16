//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) throws IOException {
        String var2 = "notas.dat";
        String var3 = "promedio.dat";
        double var6 = 0.0D;
        BufferedReader var11 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        String var1 = var11.readLine();
        System.out.print("Cantidad de Notas: ");
        int var10 = Integer.parseInt(var11.readLine());

        File var12;
        try {
            var12 = new File(var2);
            var12.createNewFile();
        } catch (IOException var17) {
            System.out.println("Problema de lectura-escritura");
        }

        FileWriter var13;
        BufferedWriter var14;
        for(int var18 = var10; var18 > 0; --var18) {
            System.out.print("Nota: ");
            double var4 = Double.parseDouble(var11.readLine());
            var6 += var4;
            try {
                var13 = new FileWriter(var2, true);
                var14 = new BufferedWriter(var13);
                var14.write(Double.toString(var4));
                var14.newLine();
                var14.flush();
            } catch (IOException var16) {
                System.out.println("Problema de lectura-escritura");
            }
        }
        double var8 = var6 / (double)var10;
        try {
            var12 = new File(var3);
            var12.createNewFile();
            var13 = new FileWriter(var3, true);
            var14 = new BufferedWriter(var13);
            var14.write(var1 + "," + Double.toString(var8));
            var14.newLine();
            var14.flush();
        } catch (IOException var15) {
            System.out.println("Problema de lectura-escritura");
        }

        System.out.println(var1 + ", tu promedio es " + var8);
    }
}