package main.java.com.example;

/*
 * Создать класс BeginsWith - — в конструкторе запоминает строку. Ему дают
 * строку, он проверяет, что она начинается с того, что он запомнил
 */
public class BeginsWith<T> implements IsGood<T> {

    private T line;
    public char[] isGood;

    public BeginsWith(T line) {
        this.line = line;
    }

    char data[] = { 'a', 'b', 'c' };
    String str = new String(data);

    public boolean isGood(T text) {

        if (((String) line).equals(((String) text).substring(0, ((String) line).length()))) {
            return true;
        }
        return false;
    }

}