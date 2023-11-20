import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    String[] personas = {"Lucas Moy", "Aldo Angelini", "Julia Gomez", "Manuel Santillan", "Juan Torres"};
/*        String[] personas = new String[10];
        personas[0] = "Lucas Moy";
        personas[1] = "Aldo Angelini";
        personas[2] = "Julia Gomez";*/


        System.out.println("Ingrese su busqueda: ");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        //Arrays.stream(personas).parallel().filter(nombre -> nombre.contains(busqueda));

        for(String nombrePersona : personas){
            if(nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("La persona es: "+ nombrePersona);
            }
        }

        /*for(int i = 0; i < personas.length; i++){
            String personaEncontrada = personas[i];
            if(busqueda.equals(personaEncontrada)){
                System.out.println("La persona es: "+ personaEncontrada);
            }

        }*/
        //System.out.println(personaEncontrada);
    }
}