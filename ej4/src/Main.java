import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Peugeot");
        cars.add("Renault");
        cars.add("Volkswagen");
        cars.add("Chevrolet");
        for (String i : cars) {
            System.out.println(i);
        }
        LinkedList<String> cars_list = new LinkedList<String>(cars);
        for (String i : cars_list) {
            System.out.println(i);
        }
    }
}