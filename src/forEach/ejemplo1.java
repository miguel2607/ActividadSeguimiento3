package forEach;

import java.util.Arrays;
import java.util.List;

public class ejemplo1 {


    public static void main(String[] args) {

        List<String > nombres = Arrays.asList("Miguel Rodriguez" , "Sofia Giraldo " , " Arle", "Brandon Medina");
        nombres.stream()
                .forEach(nombre -> System.out.println(" Hola " + nombre + " Bienvenido a el programa"));


    }
}
