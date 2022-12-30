package main.java.com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 */
public class main {
    public static void main(String[] args) {
        IsEven isEven = new IsEven();
        System.out.println(isEven.isGood(2));

        IsPositive isPositive = new IsPositive();
        System.out.println(isPositive.isGood(5));

        BeginsWithA<String, Character> beginsWitha = new BeginsWithA<String, Character>('А');
        System.out.println(beginsWitha.isGood(null));

        BeginsWith<String> beginsWith = new BeginsWith<String>(null);
        System.out.println(beginsWith.isGood);

        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(0);
        lst.add(-1);

        Filter<Integer> f = new Filter<>();
        System.out.println(f.filter(lst));

    }

}