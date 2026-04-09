import java.util.HashMap;
import java.util.Map;

public class BannerService {

    public Map<Character, String[]> createCharacterMap() {

        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[] {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[] {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        charMap.put(' ', new String[] {
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    public void displayBanner(String message, Map<Character, String[]> charMap) {

        message = message.toUpperCase();
        int height = charMap.get('O').length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}