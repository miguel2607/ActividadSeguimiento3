package Distinct;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo {

    public static void main(String[] args) {

        List<Double> numeros = Arrays.asList(3.21,72.2,96.32,7.0,99.70,3.21,96.3,99.70);

        List<Double > cambiar = numeros.stream().distinct().collect(Collectors.toList());

        System.out.println(cambiar);
    }


}
