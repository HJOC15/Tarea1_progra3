package ordenar;

import java.util.Arrays;

public class ordenando {

    public String[][] ordenar(String[][] datos){

        // PASA POR UN DOBLE PROCESO DE ORDENADO PARA GARANTIZAR UN PROCESO EXITOSO

        for (int i = 0; i < datos.length - 1 ; i++) {

            for (int j = i + i; j < datos.length; j++) {

                if (Long.parseLong(datos[i][0]) > Long.parseLong(datos[j][0])){
                    String temporal;

                    //intercambiando posición de dpi
                    temporal  = datos[i][0];
                    datos[i][0] = datos[j][0];
                    datos[j][0] = temporal;

                    //intercambiando posición de nombre
                    temporal  = datos[i][1];
                    datos[i][1] = datos[j][1];
                    datos[j][1] = temporal;

                    //intercambiando posición de edad
                    temporal  = datos[i][2];
                    datos[i][2] = datos[j][2];
                    datos[j][2] = temporal;

                }

            }
            
        }

        for (int i = 0; i < datos.length - 1 ; i++) {

            for (int j = i + i; j < datos.length; j++) {

                if (Long.parseLong(datos[i][0]) > Long.parseLong(datos[j][0])){
                    String temporal;

                    //intercambiando posición de dpi
                    temporal  = datos[i][0];
                    datos[i][0] = datos[j][0];
                    datos[j][0] = temporal;

                    //intercambiando posición de nombre
                    temporal  = datos[i][1];
                    datos[i][1] = datos[j][1];
                    datos[j][1] = temporal;

                    //intercambiando posición de edad
                    temporal  = datos[i][2];
                    datos[i][2] = datos[j][2];
                    datos[j][2] = temporal;

                }

            }

        }
        
        return datos;
    }

    public boolean busquedaBinaria(String[][] datos, String buscado){

        int largo = datos.length;// Número de elementos
        int mitad = largo/2; // Mitad del array

        if (datos[mitad][0].equals(buscado)){
            return true;
        } else if(largo == 1){
            return false;
        } else if(Long.parseLong(datos[mitad][0]) > Long.parseLong(buscado)){
            return busquedaBinaria(Arrays.copyOfRange(datos, 0, mitad), buscado);
        } else {
            return busquedaBinaria(Arrays.copyOfRange(datos, mitad+1, largo), buscado);
        }
    }

}