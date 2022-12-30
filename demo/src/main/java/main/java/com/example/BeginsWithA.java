package main.java.com.example;

/*
 * BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
 */
public class BeginsWithA<T, T2> implements IsGood<T> {

    private T2 oneLetter;

    public BeginsWithA(T2 oneLetter) {
        this.oneLetter = oneLetter;
    }

    @Override
    public boolean isGood(T item) {
        if (((String) item).charAt(0) == (char) oneLetter)
            return true;
        return false;
    }
}