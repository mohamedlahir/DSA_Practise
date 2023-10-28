import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//"7868190130M7522","5303914400F9211","9273338290F4010"
//https://leetcode.com/problems/number-of-senior-citizens/
public class NumberOfSeniorCitizens {

    String[] details = {"7868190130M7522\",\"5303914400F9211\",\"9273338290F4010"};

    public int check() {
        return (int) Arrays.stream(details)
                .filter(detail -> Integer.parseInt(detail.substring(11, 13)) > 60)
                .count();
    }

    public static void main(String[] args) {
        NumberOfSeniorCitizens obj = new NumberOfSeniorCitizens();
        System.out.println((obj.check()));
    }
}
