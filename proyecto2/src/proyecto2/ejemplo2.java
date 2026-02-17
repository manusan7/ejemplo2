package proyecto2;
import java.io.*;
import java.util.Scanner;
public class ejemplo2 {
	
	public static void main(String[] args) {
		FileReader archivoIn;
        BufferedReader bufferIn;
        Scanner sc;
        String cadenaLeida;
        double sumaLinea = 0;
        int numeroLinea = 0;
        double media;
        
        try {
            archivoIn = new FileReader ("entrada1.txt");
            bufferIn = new BufferedReader (archivoIn);
            cadenaLeida = bufferIn.readLine();
            
            while (cadenaLeida != null) {
                if (!cadenaLeida.isBlank()) {
                    sumaLinea += Double.parseDouble(cadenaLeida);
                    numeroLinea++;
                }
                cadenaLeida = bufferIn.readLine();
                System.out.println(sumaLinea);
     
            }
            
            bufferIn.close();
        } catch (IOException ex) {
            System.out.println("Archivo no encontrado.");
        }
        media = sumaLinea / numeroLinea;
        System.out.println("Suma total: " + sumaLinea);
        System.out.println("Media: " + media);
				
	}

}
