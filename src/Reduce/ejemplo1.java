package Reduce;

import java.util.Arrays;
import java.util.List;

public class ejemplo1 {

    public static void main(String[] args) {

        List<Double > miniNumeros = Arrays.asList(23.0,5184.0,8484848.0,78455.1);

        Double suma = miniNumeros.stream()
                .reduce(0.0,Double::max);
        System.out.println(suma);

    }
}
