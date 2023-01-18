/* program 3 in java 11*/

import java.util.*;

public class LazyDog {

    public static void main(String[] args) {

        String sentence = "A quick brown fox jumps over the lazy dog";

        List<String> list = new ArrayList<>();

        for (String word : sentence.split(" ")) {
            list.add(word);
        }

        String[] array = list.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
    }
}
