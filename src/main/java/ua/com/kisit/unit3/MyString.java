package ua.com.kisit.unit3;

import java.util.Arrays;

public class MyString {

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str.hashCode() + ": " +str);

        str = str + " Student!";
        System.out.println(str.hashCode() + ": " +str);

        String str2 = "Hello";
        System.out.println(str2.hashCode() + ": " +str2);

        String str3 = "Hello";
        System.out.println(str3.hashCode() + ": " +str3);

        System.out.println(str2 == str3);
        String str4 = new String("Hello");
        System.out.println(str4.hashCode());
        System.out.println(str4 == str3);

        System.out.println(str4.equals(str3));

        char[] arrays = str.toCharArray();

        for (char c : arrays) {
            System.out.println(c);
        }

        String str5 = new String(arrays);
        System.out.println(str5);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode() + ": " +sb.toString());
        sb.append('!');
        System.out.println(sb.hashCode() + ": " +sb.toString());

        StringBuffer  stringBuffer = new StringBuffer("Hello Student");
        System.out.println(stringBuffer.hashCode() + ": " +stringBuffer.toString());
        stringBuffer.append('!');
        System.out.println(stringBuffer.hashCode() + ": " +stringBuffer.toString());

        String text = "\t \n I study Java with my teacher! \n \r";
        System.out.println(text.toUpperCase().trim());
        System.out.println(text.toLowerCase().trim());

        String text2 = "I study Java with my teacher!";

        boolean logic  = text2.startsWith("I study");
        System.out.println(logic);

        boolean logic2 = text2.endsWith("!");
        System.out.println(logic2);

        System.out.println(text2.replace('a', '_'));
        System.out.println(text2.replace("st", "__"));


        String text3 = "I,study.Java_with,my.teacher!";

        String[] arrays2 = text3.split(" \\,|\\.|_");
        System.out.println(Arrays.toString(arrays2));

        String text4 = new String(text3.toCharArray(),2,10);
        System.out.println(text4);

    }
}
