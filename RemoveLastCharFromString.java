import java.util.Optional;

public class RemoveLastCharFromString {
    public static void main(String... args) {
        System.out.println(removeLastCharOptional("test"));
    }

    public static String removeLastCharOptional(String s) {
        return Optional.ofNullable(s)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(0, str.length() - 1))
                .orElse(s);
    }
}
