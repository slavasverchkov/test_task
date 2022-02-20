import java.util.*;

public class Task {
    static String[] caseNames = {"Alla", "alla", "ALLA", "Felix", "Alex", "ALex", "Den", "Fillip"};

    public static void main(String[] args) {
        testFun(caseNames);
    }

    public static void testFun(String[] arrayTest) {
        Map<String, Integer> names = new HashMap<>();
        for (String s : arrayTest) {
            String tempChar = s.toLowerCase();
            if (!names.containsKey(tempChar)) {
                names.put(tempChar, 1);
            } else {
                names.put(tempChar, names.get(tempChar) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

