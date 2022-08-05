import java.nio.charset.StandardCharsets;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isValidStringLength;
        boolean isValidSpaceLocation;
        boolean isSpaseOne;

        if (name == null) {
            return false;
        }

        isValidStringLength = name.length()>=3 && name.length()<= 19;
        isSpaseOne = name.indexOf(' ') == name.lastIndexOf(' ');
        isValidSpaceLocation = name.indexOf(' ') > 0 && name.indexOf(' ') < name.length() - 1;

        return isValidStringLength && isValidSpaceLocation && isSpaseOne;
    }

}