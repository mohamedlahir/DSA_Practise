import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class RemoveDuplicatesLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String output = "";
        String[] arr = s.toLowerCase().split("");
        List<Integer> list = new ArrayList<>();
        char charToArray[] = s.toCharArray();
        for (int i = 0; i < charToArray.length; i++) {
            int a = charToArray[i];
            list.add(i, a);
        }
//        System.out.println(list);
        Collections.sort(list);
//        System.out.println(list);
        char sortedWordInAscii;
        int words;
        String sortedWords = "";
        for (int i = 0; i < list.size(); i++) {
            words = list.get(i);
            sortedWordInAscii = (char) words;
            sortedWords = sortedWords + sortedWordInAscii;
        }
//        System.out.println(list);
        System.out.println(sortedWords);

    }
}