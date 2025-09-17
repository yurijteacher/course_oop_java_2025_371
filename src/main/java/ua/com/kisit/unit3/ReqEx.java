package ua.com.kisit.unit3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqEx {

    public static void main(String[] args) {

        String text1 = "I study Java!";

        String pattern = "[ IJa-z!]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text1);

        if (m.matches()) {
            System.out.println(true);
        }  else {
            System.out.println(false);
        }

        System.out.println(m.matches() ? true : false);

        /*
        [abc]
        [^abc]
        [a-z]
        [^a-z]
        [a-zA-Z]
        [^a-zA-Z]
        [a-zA-Z_0-9] \w
        [^a-zA-Z_0-9] \W
        [0-9] \d
        [^0-9] \D
        \b - границя слова
        \B - не на границі слова
        \n - пекрехід на новий рядок
        \t - символ табуляції
        \f - перехід на нову сторінку
        \r - повернення каретки на початок
        \s [\t\n\r\f]
        \S

        []{n} - n-разів
        []+ - може бути 1 раз або скільки завгодно
        []*
        []{n,m} [n,m]
        []{n,} - [n, ...]
        []? - 1 раз або може бути відсутнє!
         */

        String email = "Vasya-.Pypkin123_.vasya.pypkin__@90kneu.edu.ua";

        String pattern2 = "[a-zA-Z\\-]+[\\.\\w]+@[\\w]+[\\.\\w]+[a-zA-Z]{2,}";

        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(email);

        System.out.println((m2.matches() ? true : false));

    }

}
