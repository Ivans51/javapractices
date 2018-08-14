package mitocode.basic.arrays;

import java.util.*;

/**
 * Created by Ivans on 09/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Pedro", 1321312));
        people.add(new Person(2, "Ivan", 1321312));
        people.add(new Person(3, "Juan", 1321312));

        Collections.sort(people, (o1, o2) ->{
            return o1.name.compareTo(o2.name);
        });
    }

    private static class Person {
        int id;
        String name;
        int phone;

        Person(int id, String name, int phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
    }
}
