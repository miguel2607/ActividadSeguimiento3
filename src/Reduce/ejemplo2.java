package Reduce;

import java.util.Arrays;
import java.util.List;

public class ejemplo2 {

    public static void main(String[] args) {

        List<String > equipos = Arrays.asList("Real Madrid " , " Barcelona " , " Manchester City","PSG");

        String mejorEquipo = equipos.stream().reduce("", (mejor, equipo) -> mejor + equipo);
        System.out.println("Equipos  " + mejorEquipo);

    }
}
