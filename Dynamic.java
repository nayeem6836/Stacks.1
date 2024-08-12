public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
}
}
import java.util.Stack;
import java.util.Iterator;

public class Dynamic {
    public static void main(String[] args) {
        // Create an object for Stack
        Stack<Person> s = new Stack<>();

        // Load Person class objects into the Stack using push function
        s.push(new Person("fayaz", 21));
        s.push(new Person("sai", 21));
        s.push(new Person("karthik", 21));

        // Iterate over the Stack using Iterator
        Iterator<Person> i = s.iterator();

        // Print the values using while loop
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
  }
    class Person {
      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public String toString() {
          return name + "  " + age;
      }
  }
