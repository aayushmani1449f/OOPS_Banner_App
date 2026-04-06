public class BannerService {

    public BannerPattern[] createPatterns() {

        String[] o = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
                            
        String[] p = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
 
        String[] s = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        String[] space = {
                "     ", 
                "     ",
                "     ",
                "     ",
                "     "
        };

        return new BannerPattern[]{
                new BannerPattern('O', o),
                new BannerPattern('P', p),
                new BannerPattern('S', s),
                new BannerPattern(' ', space)
        };
    }

    public String[] getPattern(char ch, BannerPattern[] patterns) {
        for (BannerPattern bp : patterns) {
            if (bp.getCharacter() == ch) {
                return bp.getPattern();
            }
        }
        return getPattern(' ', patterns);
    }

    public void printMessage(String message) {

        BannerPattern[] patterns = createPatterns();
        message = message.toUpperCase();

        int height = patterns[0].getPattern().length;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getPattern(ch, patterns);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}