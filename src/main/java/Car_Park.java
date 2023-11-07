import java.util.HashSet;
import java.util.Iterator;

public class Car_Park {
        public static void main(String[] args) {
            HashSet park = new HashSet();

            park.add("AUDI");
            park.add("BENTLEY");
            park.add("BMW");
            park.add("BUGATTI");
            park.add("LAMBORGHINI");
            park.add("PORSCHE");

            System.out.println("Автомобилей на парковке : " + park.size());

            Iterator iterator = park.iterator();

            while(iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            System.out.println("Автомобилей на парковке : " + park.size());

        }
}
