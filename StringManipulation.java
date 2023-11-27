public class StringManipulation {


    public int findLength(String words) {
        int count=0;
        int numberOfLetters=0;
        String arr[] = words.split(" ");
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        String lastWord[] = arr[count-1].split("");
        for (int i = 0; i < lastWord.length; i++) {
             numberOfLetters++;
        }

return numberOfLetters;
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
sm.findLength("Hello World Lailanihar");

    }
}
