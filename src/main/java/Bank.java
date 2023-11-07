import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bank {
    public static void main(String[] args) {

        HashMap bank = new HashMap();

        bank.put("Виктор", 1000);
        bank.put("Дмитрий", 2000);
        bank.put("Владимир", 3000);
        bank.put("Ольга", 4000);
        bank.put("Анастасия", 5000);

        bank.remove("Виктор");

        Set set = bank.entrySet();

        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
}
