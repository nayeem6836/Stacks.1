import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<Integer> s  = new Stack<>();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);
  Iterator<Integer> i = s.iterator();
  while(i.hasNext()){
    System.out.println(i.next());

  }
}
}
