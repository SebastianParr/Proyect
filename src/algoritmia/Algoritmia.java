/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Parra
 */
public class Algoritmia {

//    public static void main(String[] args) {
//        String almacenamiento = "";
//        String linea1 = "";
//        String linea2 = "";
//        String linea3 = "";
//        String linea4 = "";
//        String linea5 = "";
//        String linea6 = "";
//        String comandos[] = new String[6];
//        comandos[0] = "create \"ans.txt\" as file_out";
//        comandos[1] = "create \"tmp.txt\" as tmp";
//        comandos[2] = "assign \"test.txt\" a file_in";
//        comandos[3] = "tmp = sort file_in asc";
//        comandos[4] = "tmp = rem_doubles tmp";
//        comandos[5] = "file_out = tmp";
//        int numlineas = 6;
//        String datos[] = new String[numlineas];
//        int contador = 0;
//
//        File file_out = new File("ans.txt");
//        File tmp = new File("tmp.txt");
//        File file_in = new File("test.txt");
//        FileReader lector;
//        BufferedReader br ;
//        File comandosar;
//        String co[];
//        int gg = 0;
//        int contlineas = 0;
//
//        try {
//            comandosar = new File("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\Algoritmia\\comandos.txt");
//            FileReader LA1 = new FileReader(comandosar);
//            BufferedReader BRCO = new BufferedReader(LA1);
//
//            almacenamiento = BRCO.readLine();
////            while ((almacenamiento = BRCO.readLine()) != null) {
////                cont++;
////                for (int i = 0; i < comandos.length; i++) {
////                    if (!(almacenamiento.equals(comandos[i]))) {
////                        System.out.println("La linea " + cont + " està mal escrita");
////
////                    } else {
////                        System.out.println("El comando " + almacenamiento + " està bien escrita");
////
////                    }
////                }
////            }
//           while((almacenamiento=BRCO.readLine())!=null){
//               contlineas++;
//           }
//           System.out.println("Número de líneas "+contlineas);
//            while (almacenamiento != null && contador < numlineas) {
//                datos[contador] = almacenamiento;
//                almacenamiento = BRCO.readLine();
//                contador++;
//                
//            }
//            
//            BRCO.close();
//
//            linea1 = datos[0];
//            linea2 = datos[1];
//            linea3 = datos[2];
//            linea4 = datos[3];
//            linea5 = datos[4];
//            linea6 = datos[5];
//
////                for(int i=0; i<comandos.length; i++){
////                    if(linea1.equals(comandos[i])){
////                        System.out.println("Línea 1 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else if(linea2.equals(comandos[i])){
////                        System.out.println("Línea 2 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else if(linea3.equals(comandos[i])){
////                        System.out.println("Línea 3 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else if(linea4.equals(comandos[i])){
////                        System.out.println("Línea 4 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else if(linea5.equals(comandos[i])){
////                        System.out.println("Línea 5 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else if(linea6.equals(comandos[i])){
////                        System.out.println("Línea 6 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
////                    }else{
////                        JOptionPane.showMessageDialog(null,"Hay un error en la sintaxis en la línea del archivo de comandos "+comandos[i]);
////                    }
////                }
////            for (int i = 0; i < (contlineas+1); i++) {
////                if (linea1.equals("create \"ans.txt\" as file_out")) {
////                    file_out.createNewFile();
////                } else if (linea1.equals("create \"tmp.txt\" as tmp")) {
////                    tmp.createNewFile();
////                } else if (linea1.equals("assign \"test.txt\" a file_in")) {
////                   lector = new FileReader("test.txt");
////                   br=new BufferedReader(lector);
////                   
////                } else if (linea1.equals("tmp = sort file_in asc")) {
////                   String cadena="", cadena2="";
////                   String dato[];
////                   lector = new FileReader("test.txt");
////                   br=new BufferedReader(lector);
////                   while((cadena=br.readLine())!=null){
////                       cadena2+=cadena;
////                   }
////                   dato=cadena2.split(" ");
////                   Arrays.sort(dato);
////                } else if (linea1.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea1.equals("file_out = tmp")) {
////
////                } else if (linea2.equals("create \"ans.txt\" as file_out")) {
////
////                } else if (linea2.equals("create \"tmp.txt\" as tmp")) {
////
////                } else if (linea2.equals("assign \"test.txt\" a file_in")) {
////
////                } else if (linea2.equals("tmp = sort file_in asc")) {
////
////                } else if (linea2.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea2.equals("file_out = tmp")) {
////
////                } else if (linea3.equals("create \"ans.txt\" as file_out")) {
////
////                } else if (linea3.equals("create \"tmp.txt\" as tmp")) {
////
////                } else if (linea3.equals("assign \"test.txt\" a file_in")) {
////
////                } else if (linea3.equals("tmp = sort file_in asc")) {
////
////                } else if (linea3.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea3.equals("file_out = tmp")) {
////
////                } else if (linea4.equals("create \"ans.txt\" as file_out")) {
////
////                } else if (linea4.equals("create \"tmp.txt\" as tmp")) {
////
////                } else if (linea4.equals("assign \"test.txt\" a file_in")) {
////
////                } else if (linea4.equals("tmp = sort file_in asc")) {
////
////                } else if (linea4.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea4.equals("file_out = tmp")) {
////
////                } else if (linea5.equals("create \"ans.txt\" as file_out")) {
////
////                } else if (linea5.equals("create \"tmp.txt\" as tmp")) {
////
////                } else if (linea5.equals("assign \"test.txt\" a file_in")) {
////
////                } else if (linea5.equals("tmp = sort file_in asc")) {
////
////                } else if (linea5.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea5.equals("file_out = tmp")) {
////
////                } else if (linea6.equals("create \"ans.txt\" as file_out")) {
////
////                } else if (linea6.equals("create \"tmp.txt\" as tmp")) {
////
////                } else if (linea6.equals("assign \"test.txt\" a file_in")) {
////
////                } else if (linea6.equals("tmp = sort file_in asc")) {
////
////                } else if (linea6.equals("tmp = rem_doubles tmp")) {
////
////                } else if (linea6.equals("file_out = tmp")) {
////
////                } else {
////                    JOptionPane.showMessageDialog(null, "Hay un error en la sintaxis en la línea del archivo de comandos " + comandos[i]);
////                }
////            }
//        } catch (IOException ex) {
//
//        }
//    }
    public static void main(String[] args) {
        String arreComm[];
        int cont = 0;
        boolean pass = true;
        String line = " ";
        //Read commands file 
        File coman = null;
        FileReader fr = null;
        BufferedReader br = null;
        //Read commands file again
        FileReader fr2 = null;
        BufferedReader br2 = null;
        //Declare file
        File file_out = null;
        File tmp = null;
        File file_in = null;
        //Read file file_in
        FileReader fr3 = null;
        BufferedReader br3 = null;
        //Write file tmp
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        int lineas=0;

        try {
            coman = new File("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\Algoritmia\\comandos.txt");
            fr = new FileReader(coman);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                cont++;
                
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        int contador = 0;
        if (pass == true) {
            System.out.println("/////////////////////////////////////////////////");
            try {
                fr2 = new FileReader(coman);
                br2 = new BufferedReader(fr2);
                String lines = "";
                String arre[] = new String[cont + 1];
                String cadena = "";
                while ((lines = br2.readLine()) != null) {
                    arre[contador] = lines;
                    contador++;

                }
                
                try {

                    String vector[] = null;
                    String namefile;
                    String arch1[]=null;
                    for (int i = 0; i < cont + 1; i++) {
                        
                        vector = arre[i].split(" ");
                        for (int j = 0; j < vector.length; j++) {
                            
                            if (vector[j].equals("create")) {
                                namefile = vector[j + 1];
                                arch1[j] = vector[j + 3];
                                File file = new File(namefile);
                                try {
                                    file.createNewFile();

                                } catch (IOException e) {
                                    System.out.println(e);
                                }
                                System.out.println("Se creó el archivo, " + vector[j + 1] + vector[j + 3] + namefile + " exitosamente");
                            } else if (vector[j].equals("assign")) {
                                file_in= new File("test.txt");
                                System.out.println("Se asignó el archivo test.txt a file in exitosamente");
                            }else if(vector[j].equals(arch1)){
                                System.out.println(vector[j]);
                            }

                        }
                    }
                } catch (NullPointerException e) {
                    //System.out.println(e);
                }
                //arre = cadena.split(" ");
//                for(int i=0; i<arre.length; i++){
//                System.out.println(arre[i]);
//                }
                br2.close();
            } catch (IOException ex) {
                System.out.println("The file could'nt be read." + ex);;
            }
        } else {
            System.out.println("There is an incorrect command, correct it.");
        }
    }

}
