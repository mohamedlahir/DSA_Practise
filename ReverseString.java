public class ReverseString {

static void reverseIt(char[] s){



    for (int i = s.length-4; i >= 0; i--) {
        System.out.println(s[i]);
    }

}

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
    reverseIt(s);
    }

}
