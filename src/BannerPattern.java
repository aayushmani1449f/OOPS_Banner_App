import java.util.HashMap;
import java.util.Map;

public class BannerPattern {

    public static Map<Character, String[]> getPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[] {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[] {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patterns;
    }
}