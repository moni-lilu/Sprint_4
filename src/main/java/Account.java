public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        String firstSymbol = String.valueOf(name.charAt(0));
        String lastSymbol = String.valueOf(name.charAt(name.length() - 1));
        int numberOfSpaces = 0;

        for (int i = 0; i < name.length(); i++) {
            if (String.valueOf(name.charAt(i)).equals(" ")) {
                numberOfSpaces = numberOfSpaces + 1;
            }
        }

        if (name.length()<3
                || name.length()>19
                || numberOfSpaces == 0
                || numberOfSpaces > 1
                || firstSymbol.equals(" ")
                || lastSymbol.equals(" ")) {
            return false;
        } else {
            return true;
        }
    }

}