import java.util.Map;

public class BannerService {

    public void printBanner(String text) {
        Map<Character, String[]> patterns = BannerPattern.getPatterns();
        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            String[] lineParts = new String[text.length()];

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (patterns.containsKey(ch)) {
                    lineParts[i] = patterns.get(ch)[row];
                } else {
                    lineParts[i] = "     ";
                }
            }

            System.out.println(String.join("  ", lineParts));
        }
    }
}