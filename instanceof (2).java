import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new ArrayList<String>(); 
        Object obj2 = new LinkedList<Integer>(); 

        if (obj1 instanceof ArrayList) {
            System.out.println("obj1 — это ArrayList");
        }

        if (obj2 instanceof List) {
            System.out.println("obj2 — это List");
        }
        
        /*if (obj1 instanceof ArrayList<String>) {  - запрещено
        ...
        }*/
    }
}