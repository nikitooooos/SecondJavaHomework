import java.util.Collections;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue queue1 = new PriorityQueue<>();
        queue1.offer("Россия");
        queue1.offer("Германия");
        queue1.offer("Нигерия");
        queue1.offer("США");
        queue1.offer("Мексика");
        System.out.print("Сортировка по Comparable: ");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();

        PriorityQueue queue2 = new PriorityQueue(5, Collections.reverseOrder());
        queue2.offer("Россия");
        queue2.offer("Германия");
        queue2.offer("Нигерия");
        queue2.offer("США");
        queue2.offer("Мексика");
        System.out.print("Сортировка по Comparator: ");
        queue2.remove("Германия");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
