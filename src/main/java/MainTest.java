import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(12);
        System.out.println(person.getAge());

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        System.out.println(map);
        map.put(1,"B");
        System.out.println(map);

    }
}
