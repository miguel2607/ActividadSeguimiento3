package forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejemplo2 {


    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(2,3,4,5,45,634,3253,4325,463,5635,374,68);

        numeros.stream().forEach(numeritos -> System.out.println(numeritos * 2));


    }
}
