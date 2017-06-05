package mitocode.java8.collectionsjava8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivans on 5/7/2017.
 */
public class StreamParallel {

    private List<Integer> list;

    public void fill(){
        list = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            list.add(i);
        }
    }

    public void testStream(){
        list.stream().forEach(integer -> System.out.println(integer));
    }

    public void testParallel(){
        list.parallelStream().forEach(integer -> System.out.println(integer));
    }

    public static void main(String[] args) {

        StreamParallel sp = new StreamParallel();
        sp.fill();
        // sp.testStream();
        sp.testParallel();
    }

}
