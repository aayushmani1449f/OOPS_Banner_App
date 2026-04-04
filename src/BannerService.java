import java.util.Map;

public class BannerService {

    public void printBanner(String text) {
        Map<Character, String[]> patterns = BannerPattern.getPatterns();

        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char ch : text.toCharArray()) {
                if (patterns.containsKey(ch)) {
                    System.out.print(patterns.get(ch)[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}