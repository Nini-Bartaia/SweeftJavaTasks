
import java.util.HashSet;

public class Task2 {

    public int happyString(String allowed, String[] words) {
        HashSet<Character> allowedChars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }

        int ans = 0;
        for (String w : words) {
            boolean isHappy = true;
            for (char c : w.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    isHappy = false;
                    break;
                }
            }
            if (isHappy) {
                ans++;
            }
        }
        return ans;
    }


}



