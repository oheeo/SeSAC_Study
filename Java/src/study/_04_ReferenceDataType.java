package study;

import java.util.Arrays;

public class _04_ReferenceDataType {

    public static void main(String[] args) {
//        String str1 = "안녕"+"하세요"+"!";
//        System.out.println(str1);  // 메모리에 비효율적
//
//        String str2 = "반갑";
//        str2+="습니다";
//        str2+="!";
//        System.out.println(str2);
//        System.out.println();

        System.out.println("------------");

//        String str1 = "Hello Java!";
//        String str2 = "안녕하세요! 반갑습니다.";
//
//        System.out.println(str1.indexOf('a',8));
//        System.out.println(str1.lastIndexOf('a',8));
//
//        System.out.println(str1.indexOf("Java"));
//        System.out.println(str1.lastIndexOf("Java"));
//
//        System.out.println(str2.indexOf("하세요"));
//        System.out.println(str2.lastIndexOf("하세요"));
//
//        System.out.println(str2.indexOf("Bye"));
//        System.out.println(str2.indexOf("고맙습니다."));

        System.out.println("------------");

        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str1.replace("Study", "공부"));

        System.out.println(str1.substring(0,5));

        String[] strArray = "abc/def-ghi jkl".split("/|-|");
        System.out.println(Arrays.toString(strArray));

        System.out.println("  abc  ".trim());
        System.out.println();


    }

}