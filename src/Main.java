import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BannerService service = new BannerService();
        Map<Character, String[]> map = service.createCharacterMap();
        service.displayBanner("OOPS", map);
    }
}