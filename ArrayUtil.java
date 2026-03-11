import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayUtil {
public static void main(String[] a){
//    ArrayList<String> cars = new ArrayList<>();
//    cars.add("Honda");
//    cars.add("Volvo");
//    cars.add("Benz");
//    cars.add("Hyundrai");
//    cars.add("\"Camry\"");
//    System.out.println(cars);
//    for (int i = 0; i < cars.size() ; ++i){
//    System.out.println(cars.get(i));
//    }
//    String[] cars = {"honda", "ddd"};
//    for(int i = 0; i < cars.length ; ++i){
//        System.out.println(cars[i]);
//    }
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    Collections.sort(numbers);
    for (int i : numbers){
        System.out.println(i);
    }
}
}
