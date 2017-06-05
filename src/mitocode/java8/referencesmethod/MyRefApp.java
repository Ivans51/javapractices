package mitocode.java8.referencesmethod;

import mitocode.advanced.collection.Persona;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Ivans on 5/7/2017.
 */
public class MyRefApp {

    public static void referencesMethodStatic(){
        System.out.println("Method references static");
    }

    public void referenceMethodInstanceObjectArbitrario(){
        String[] names = {"Juan" , "Code", "Ivan"};
        /*Arrays.sort(names, (o1, o2) -> o2.compareToIgnoreCase(o1));
        System.out.println(Arrays.toString(names));*/

        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

    public void referencesMethodObject(){
        System.out.println("Method particular");
    }

    public void referencesConstructor(){
        /*IPersona ip = new IPersona() {
            @Override
            public Persona create(int id, String name, int age) {
                return new Persona(id, name, age);
            }
        };
        ip.create(12, "Ivan", 14);*/

        IPersona ip = (id, name, age) -> new Persona(id, name, age);
        Persona per = ip.create(12, "Ivan", 14);
        System.out.println(per.getAge() + " - " + per.getId() + " - " + per.getName());

        IPersona ip2 = Persona::new;
        Persona per2 = ip2.create(12, "Ivan", 14);
        System.out.println(per2.getAge() + " - " + per2.getId() + " - " + per2.getName());

    }

    public void operation(){
        /*Operation op = () -> MyRefApp.referencesMethodStatic();
        op.salute();*/
        Operation op = MyRefApp::referencesMethodStatic;
        op.salute();
    }

    public static void main(String[] args) {
        MyRefApp myRA = new MyRefApp();
//        myRA.referenceMethodInstanceObjectArbitrario();
        /*Operation op = myRA::referencesMethodObject;
        op.salute();*/
        myRA.referencesConstructor();
    }
}
