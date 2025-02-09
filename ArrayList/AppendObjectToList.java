package Question_Problem.ArrayList;

import java.util.ArrayList;

public class AppendObjectToList {
    public static void main(String[] args) {

        // define a class
        class person {
            String name;
            int age;

            person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString(){
                return "Name: "+ name + ", Age: "+age;
            }
        }


        // create an Arraylist to hold person object
        ArrayList<person> people = new ArrayList<>();

        // Append objects to the list
        people.add(new person("oggy", 25));
        people.add(new person("bob", 20));

        // print the list
        for(person Person : people){
            System.out.println(Person);
        }

        // Adding another object
        person charlie = new person("charlie", 28);
        people.add(charlie);

        // adding at beginning
        person jack = new person("jack",27);
        people.addFirst(jack);

        System.out.println("\nAfter adding another person: ");
        for(person Person : people){
            System.out.println(Person);
        }

        // Remove the last element
        System.out.println(people.removeLast());
        System.out.println("\nAfter remove last person: ");
        for(person Person : people){
            System.out.println(Person);
        }

       // boolean contains = people.contains(jack);
        System.out.println(people.contains(jack));

    }

}
