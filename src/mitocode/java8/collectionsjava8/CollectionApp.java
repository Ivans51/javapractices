package mitocode.java8.collectionsjava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ivans on 5/7/2017.
 */
public class CollectionApp {

    private List<String> list;

    public void fillList(){
        list = new ArrayList<>();

        list.add("Ivan");
        list.add("Juan");
        list.add("Pedro");
    }

    public void useForEach(){
        /*for (String item : list) {
            System.out.println(item);
        }*/
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::print);
    }

    public void useRemove(){
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("Ivan"));
            it.remove();
        }*/
        list.removeIf(s -> s.equalsIgnoreCase("Ivan"));
    }

    public void useSort(){
        list.sort(String::compareTo);
    }

    public static void main(String[] args) {
        CollectionApp cApp = new CollectionApp();
        cApp.fillList();
//        cApp.useRemove();
//        cApp.useForEach();
        cApp.useSort();
    }

}
