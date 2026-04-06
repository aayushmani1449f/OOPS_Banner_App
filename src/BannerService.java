public class BannerService {

    public void printBanner(String text) {

        String[] lines = {
                String.join("  ", " *** ", " *** ", "**** ", " ****"),
                String.join("  ", "*   *", "*   *", "*   *", "*    "),
                String.join("  ", "*   *", "*   *", "**** ", " *** "),
                String.join("  ", "*   *", "*   *", "*    ", "    *"),
                String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}