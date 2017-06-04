package mitocode.java8.collectionsjava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ivans on 5/7/2017.
 */
public class StreamApp {

    private List<String> list;
    private List<String> number;

    public StreamApp() {
        list = new ArrayList<>();

        list.add("Ivan");
        list.add("Juan");
        list.add("Pedro");

        number = new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");
    }

    public void filterF (){
        Stream<String> listStream = list.stream().filter(s -> s.startsWith("I"));
        listStream.forEach(System.out::println);
    }

    public void orderF(){
//        list.stream().sorted().forEach(s -> System.out.println(s));
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
    }

    public void transformF(){
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
        /*for (String n : number) {
            int number = Integer.parseInt(n) + 1;
            System.out.println(number);
        }*/
        number.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
    }

    public void limitF(){
        number.stream().limit(2).forEach(System.out::println);
    }

    public void countF(){
        long count = number.stream().count();
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StreamApp sa = new StreamApp();
        sa.filterF();
        sa.orderF();
        sa.transformF();
        sa.limitF();
        sa.countF();
    }
}
