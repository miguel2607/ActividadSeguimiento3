package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1 {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Java", "Python", "Java", "C++", "Python");


        List<String> lista = palabras.stream()
                .collect(Collectors.toList());
        System.out.println("Lista: " + lista);


    }
}
