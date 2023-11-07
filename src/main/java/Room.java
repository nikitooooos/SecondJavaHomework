import java.util.ArrayList;
public class Room{

    public static void main(String[] args) {
        ArrayList room = new ArrayList();

        room.add("Cat");
        room.add("Laptop");
        room.add("Sofa");
        room.add("Table");
        room.add("Chair");

        System.out.println(room);
        System.out.println(room.get(2));

        room.remove(1);
        room.set(0, "Dog");
        room.add("Box");

        for (int i = 0; i < room.size(); i++){
            System.out.println("My " + room.get(i));
        }
    }
}