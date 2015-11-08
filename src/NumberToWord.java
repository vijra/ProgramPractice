
import java.lang.System;


public class NumberToWord {
    private static final String[] specialNames = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    public String convert(int number) {

        if (number == 0) { return "zero"; }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
//                System.out.println("current = " + current);
            }
            place++;
            number /= 1000;
//            System.out.println("n =" + n + "  number = " + number);
        } while (number > 0);

        return (prefix + current).trim();
    }
    public String convert (double number) {
        int inum = (int)number;
        System.out.println(inum);
        double digitnum = number - inum;
        digitnum = Math.round(digitnum);
        String str = String.valueOf(digitnum);
        System.out.println("strin with digit number" + str);
        str = str.substring(2);
        if (str.length() > 2) {
            str = str.substring(0,2);
        }
        System.out.println("string aftere replace . " + str);

        int value = Integer.valueOf(str);
        String result = convert(inum) + " and " + convert(value) + " cent";
        if (value != 1) {
            result += "s";
        }
        return result;
    }


    public static void main(String[] args) {
        NumberToWord obj = new NumberToWord();
//        System.out.println("*** " + obj.convert(123456789));
//        System.out.println("*** " + obj.convert(-55));
        System.out.println("*** " + obj.convert(187867.03));
    }
}