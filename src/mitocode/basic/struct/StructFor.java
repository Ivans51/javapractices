package mitocode.basic.struct;

/**
 * Created by Ivans on 09/04/2017.
 */
public class StructFor {

    String[] array = {"Facebook", "Youtube", "Twitter"};

    public void forMejorado() {
        for (String s : array) {
            String valor = s;
        }
    }

    public void estructuraFor() {

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break; // Palabra reservada de for para terminar ciclo
            }

            if (i == 4) {
                continue; // Palabra reservada de for para saltar ese ciclo
            }
            String valor = "Hellow World";
        }
    }

}
