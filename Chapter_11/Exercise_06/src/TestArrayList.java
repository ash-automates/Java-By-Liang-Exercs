import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Date());
        objects.add("Hello World!");
        objects.add(new Circle());
        objects.add(new Loan());
        for (Object obj: objects) {
            System.out.println(obj);
        }
    }
}
