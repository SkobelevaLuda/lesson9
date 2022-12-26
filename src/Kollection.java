import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Kollection {
    private static final Map<String,Integer>MAP= new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MAP.put(String.valueOf(i),i);
            
        }

        System.out.println(MAP);

    }

    private static void tryPut(String key, Integer value){
        if (MAP.containsKey(key)&& MAP.get(key).equals(value)){
            throw new IllegalArgumentException("Такой ключ и значение уже есть!");
        }
        MAP.put(key,value);

    }

}
