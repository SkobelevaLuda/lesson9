import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Map<String, List<Integer>> map=new HashMap<>();
        int mapSize = 5;
        int listSize = 3;
        for (int i = 0; mapSize < 5; i++) {
            List<Integer>numbers = new ArrayList<>(listSize);
            for (int j = 0; j <listSize; j++) {
                numbers.add(random.nextInt(1000));
            }
            map.put(String.valueOf(i),numbers);
        }
    }
}
