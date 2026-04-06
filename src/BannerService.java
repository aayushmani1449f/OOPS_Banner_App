public class BannerService {

    public void printBanner(String text) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                    oPattern[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }
}