package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejemplo2 {

    public static void main(String[] args) {

        List<String> equipos = Arrays.asList("Barcelona", "Real Madrid", "Barcelona", "Liverpool", "Liverpool");

        Set<String> conjunto = equipos.stream()
                .collect(Collectors.toSet());
        System.out.println("Conjunto: " + conjunto);


    }
}
