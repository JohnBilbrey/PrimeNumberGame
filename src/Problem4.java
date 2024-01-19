import java.util.HashMap;

public class Problem4 {
    public static int romanNumeralConverter(String s){
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            char currentChar = s.charAt(i);
            int currentValue = values.get(currentChar);

            if (currentValue < previousValue){
                result -= currentValue;
            }
            else{
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}
