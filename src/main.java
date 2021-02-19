import java.util.Scanner;

import ordenar.ordenando;

public class main {
    public static void main(String[] args){

        //Declaramos un Scanner para ingresar datos.
        Scanner keyboard = new Scanner(System.in);

        // Creamos una variable para que la persona decida cuantos datos registrar
        int cantidad;

        //Preguntamos a la persona cuantos datos quiere ingresar en la aplicación
        System.out.print("Ingresa la cantidad de personas a ingresar: ");
        cantidad = keyboard.nextInt();

        if (cantidad > 50){
            System.out.println("Solamente puede ingresar 50 personas como máximo.");
        }else{
            //Declaramos un array para poder guardar los datos y le damos un
            // tamaño con la cantidad ingresada antes por el usuario

            String[][] datos_personas = new String[cantidad][3];

            /*
             * El array funciona así; X cantidad de datoas a ingresar y
             *  cada dato tendrá 3 datos dentro, DPI, Nombre y Edad
             * */

            //creamos un bucle para rellenar los datos

            for (int i = 0; i < datos_personas.length; i++) {
                System.out.println("**********************************");

                // 0 es el índice del DPI
                // 1 es el índice del Nombre
                // 2 es el índice de la Edad

                System.out.println("Ingresa los datos de la persona número: " + (i+1));
                System.out.print("DPI: ");
                datos_personas[i][0] = keyboard.next();
                System.out.print("Nombre: ");
                datos_personas[i][1] = keyboard.next();
                System.out.print("Edad: ");
                datos_personas[i][2] = keyboard.next();


                System.out.println("**********************************");
            }

            //Imprimimos los datos:
            for (int j = 0; j < datos_personas.length; j++) {
                System.out.println("***********************************");
                System.out.println("Persona número: #" + (j+1));
                System.out.println("Dpi: " + datos_personas[j][0]);
                System.out.println("Nombre: " + datos_personas[j][1]);
                System.out.println("Edad: " + datos_personas[j][2]);
            }

            //Ordenamiento de datos

            //Declaramos un objeto para usar los metodos de "ordenando"
            ordenando ordenar = new ordenando();

            datos_personas = ordenar.ordenar(datos_personas);

            //Imprimimos los datos de nuevo:
            System.out.println("DATOS ORDENADOS");
            System.out.println("DATOS ORDENADOS");
            System.out.println("DATOS ORDENADOS");
            for (int j = 0; j < datos_personas.length; j++) {
                System.out.println("***********************************");
                System.out.println("Persona número: #" + (j+1));
                System.out.println("Dpi: " + datos_personas[j][0]);
                System.out.println("Nombre: " + datos_personas[j][1]);
                System.out.println("Edad: " + datos_personas[j][2]);
            }

            //Busqueda binaria

            System.out.print("Ingrese el DPI a buscar: ");
            String DPI = keyboard.next();

            System.out.println();
            System.out.println();
            System.out.println();


            if (ordenar.busquedaBinaria(datos_personas, DPI)){

                System.out.println("Dato encontrado");

                for (String[] datos_persona : datos_personas) {
                    if (datos_persona[0].equals(DPI)) {
                        System.out.print("DPI: " + datos_persona[0]);
                        System.out.print(" - Nombre: " + datos_persona[1]);
                        System.out.println(" - Edad: " + datos_persona[2]);
                    }
                }

            } else {
                System.out.println("Dato no encontrado.");
            }

        }
    }
}
