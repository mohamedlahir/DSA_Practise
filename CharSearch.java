import java.util.Arrays;

public class CharSearch {

    public static void main(String[] args) {
        String name = "Lahir";
        char letterToCheck;

boolean isPresent=false;
        String a[] = name.toLowerCase().split("");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains("g")){
                isPresent=true;
                break;
            }else {
               isPresent=false;
            }
        }
        System.out.println(isPresent);
    }
}
