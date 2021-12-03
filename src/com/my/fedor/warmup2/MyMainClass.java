package com.my.fedor.warmup2;


public class MyMainClass {
    //26 Warmup-1 > in3050
    public boolean in3050(int a, int b) {
        return true;
    }

    //25 Warmup-1 > close10
    public static int close10(int a, int b) {
    int a10= Math.abs(a-10);
    int b10= Math.abs(b-10);
    if (a10<b10) {
        return a;
    }
    if (b10<a10){
        return b;
    }
    return 0;
    }
    //24 Warmup-1 > intMax
    public static  int intMax(int a, int b, int c) {
    return Math.max(Math.max(a,b),c);
    }

    //23 Warmup-1 > startOz
    public static String startOz(String str) {
        String mstr = "";
        if (str.length() >= 1 && str.substring(0,1).equals("o")) {
            mstr = mstr + str.substring(0,1);
        }
        if (str.length() >= 2 && str.substring(1,2).equals("z")) {
            mstr = mstr + str.substring(1,2);
        }
        return mstr;
    }

    //22  Warmup-1 > mixStart
    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;
    }

    //21 Warmup-1 > delDel
    public static String delDel(String str) {
        if (str.length() <= 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4, str.length());
        }
        return str;

    }

    //20 Warmup-1 > loneTeen
    public static boolean loneTeen(int a, int b) {
        if ((a <= 19 && a >= 13) && (b <= 19 && b >= 13)) {
            return false;
        } else if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13)) {
            return true;
        }
        return false;
    }

    //19 Warmup-1 > hasTeen
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    //18 Warmup-1 > in1020
    public static boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }

    //17 Warmup-1 > icyHot
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    //16 Warmup-1 > startHi
    public static boolean startHi(String str) {
        if (str.length() < 2) return false;
        if (str.substring(0, 2).equals("hi")) {
            return true;
        }
        return false;
    }

    //15 Warmup-1 > front22
    public static String front22(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }

    //14 Warmup-1 > or35
    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    //13 Warmup-1 > backAround3
    public static String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    //12 Warmup-1 > front3
    public static String front3(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        } else return str + str + str;
    }

    //11 Warmup-1 > frontBack
    public static String frontBack(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }

    //10 Warmup-1 > missingChar
    public static String missingChar(String str, int n) {
        if (n > str.length() || n < 0) {
            return "Ошибка в номере символа";
        }
        String begin = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        return begin + end;
    }

    //9 Warmup-1 > notString
    public static String notString(String str) {
        if (str.substring(0, 2).equals("не")) {
            return str;
        } else return "не " + str;
    }

    //8 Warmup-1 > posNeg
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative == true && a < 0 && b < 0) {
            return true;
        } else if ((a < 0 || b < 0) && negative == false) {
            return true;
        }
        return false;

    }

    //7 Warmup-1 > nearHundred
    public static boolean nearHundred(int n) {
        if (n < 100 - 10 || (n > 100 + 10 && n < 200 - 10) || n > 200 + 10) {
            return false;
        }
        return true;
    }

    //6 Warmup-1 > makes10
    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    //5 Warmup-1 > parrotTrouble
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 23 || hour < 0) {
            System.out.println("неправильный час");
            return false;
        }
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    //4 Warmup-1 > diff21
    public static int diff21(int n) {
        if (n <= 21) return 21 - n;
        return 0;
    }

    // 3 Warmup-1 > sumDouble
    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return a * 4;
    }


    // 2 Warmup-1 > monkeyTrouble
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        }
        return false;
    }

    //1  Warmup-1 > sleepIn
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        //1  Warmup-1 > sleepIn
        System.out.println("1- Warmup-1 > sleepIn -----------------------------");
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));

        //2 Warmup-1 > monkeyTrouble
        System.out.println("2- Warmup-1 > monkeyTrouble -----------------------------");
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, true));

        // 3 Warmup-1 > sumDouble
        System.out.println("3- Warmup-1 > sumDouble -----------------------------");
        System.out.println(sumDouble(1, 1));
        System.out.println(sumDouble(2, 3));
        System.out.println(sumDouble(2, 2));

        //4  Warmup-1 > diff21
        System.out.println("4- Warmup-1 > diff21 -----------------------------");
        System.out.println(diff21(1));
        System.out.println(diff21(-2));
        System.out.println(diff21(10));

        //5 Warmup-1 > parrotTrouble
        System.out.println("5- Warmup-1 > parrotTrouble -----------------------------");
        System.out.println(parrotTrouble(true, 1));
        System.out.println(parrotTrouble(true, 13));
        System.out.println(parrotTrouble(true, 22));

        //6 Warmup-1 > makes10
        System.out.println("6- Warmup-1 > makes10 -----------------------------");

        System.out.println(makes10(10, 10));
        System.out.println(makes10(10, 5));
        System.out.println(makes10(1, 10));
        System.out.println(makes10(3, 5));
        System.out.println(makes10(1, 8));

        //7 Warmup-1 > nearHundred
        System.out.println("7- Warmup-1 > nearHundred -----------------------------");

        System.out.println(nearHundred(100));
        System.out.println(nearHundred(105));
        System.out.println(nearHundred(150));
        System.out.println(nearHundred(189));
        System.out.println(nearHundred(91));

        System.out.println("8- Warmup-1 > posNeg -----------------------------");

        //8 Warmup-1 > posNeg
        System.out.println(posNeg(-1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(1, 1, false));
        System.out.println(posNeg(1, -10, false));
        System.out.println(posNeg(-1, -1, true));
        System.out.println(posNeg(-1, 1, true));
        System.out.println(posNeg(1, 1, true));
        System.out.println(posNeg(1, -10, true));

        //9  Warmup-1 > notString
        System.out.println("9- Warmup-1 > notString -----------------------------");

        System.out.println(notString("плохо"));
        System.out.println(notString("не плохо"));
        System.out.println(notString("хорошо"));
        System.out.println(notString("не хорошо"));
        System.out.println(notString("ты уволен"));
        System.out.println(notString("не ты уволен"));

        //10 Warmup-1 > missingChar
        System.out.println("10- Warmup-1 > missingCha -----------------------------");
        System.out.println(missingChar("хорошо", 5));
        System.out.println(missingChar("не хорошо", 1));
        System.out.println(missingChar("ты уволен", 5));
        System.out.println(missingChar("не ты уволен", 11));

        //11 Warmup-1 > frontBack
        System.out.println("11- Warmup-1 > frontBack -----------------------------");
        System.out.println(frontBack("хорошо"));
        System.out.println(frontBack("не хорошо"));
        System.out.println(frontBack("ты уволен"));
        System.out.println(frontBack("уволен"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ау"));
        System.out.println(frontBack("уау"));
        System.out.println(frontBack("ыва"));
        //12 Warmup-1 > front3
        System.out.println("12- Warmup-1 > front3 -----------------------------");
        System.out.println(front3("уволен"));
        System.out.println(front3("a"));
        System.out.println(front3("ау"));
        System.out.println(front3("уау"));
        //13 Warmup-1 > backAround3
        System.out.println("13- Warmup-1 > backAround -----------------------------");
        System.out.println(backAround("принят"));
        System.out.println(backAround("a"));
        System.out.println(backAround("ау"));
        System.out.println(backAround("уау"));
        //14 Warmup-1 > or35
        System.out.println("14- Warmup-1 > or35-----------------------------");
        System.out.println(or35(9));
        System.out.println(or35(15));
        System.out.println(or35(20));
        System.out.println(or35(17));
        System.out.println(or35(26));
        //15 Warmup-1 > front22
        System.out.println("15- Warmup-1 > front22-----------------------------");
        System.out.println(front22("принят"));
        System.out.println(front22("a"));
        System.out.println(front22("ау"));
        System.out.println(front22("уау"));
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        //16 Warmup-1 > startHi
        System.out.println("16- Warmup-1 > startHi-----------------------------");
        System.out.println(startHi("принят"));
        System.out.println(startHi("a"));
        System.out.println(startHi("ау"));
        System.out.println(startHi("hi уау"));
        System.out.println(startHi("kitten"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("abc"));
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        //17 Warmup-1 > icyHot
        System.out.println("17- Warmup-1 > icyHot-----------------------------");
        System.out.println(icyHot(9, 150));
        System.out.println(icyHot(150, -9));
        System.out.println(icyHot(20, -100));
        System.out.println(icyHot(170, -20));
        System.out.println(icyHot(-100, 120));
        //18 Warmup-1 > in1020
        System.out.println("18- Warmup-1 > in1020-----------------------------");
        System.out.println(in1020(9, 150));
        System.out.println(in1020(150, 15));
        System.out.println(in1020(20, -100));
        System.out.println(in1020(19, -20));
        System.out.println(in1020(-100, 120));
        //19 Warmup-1 > hasTeen
        System.out.println("19- Warmup-1 > hasTeen-----------------------------");
        System.out.println(hasTeen(9, 110, 15));
        System.out.println(hasTeen(40, 15, 6));
        System.out.println(hasTeen(20, 40, 9));
        System.out.println(hasTeen(19, 20, 35));
        System.out.println(hasTeen(10, 12, 14));
        //20 Warmup-1 > loneTeen
        System.out.println("20- Warmup-1 > loneTeen-----------------------------");
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 40));
        System.out.println(loneTeen(19, 15));
        System.out.println(loneTeen(10, 12));
        //21 Warmup-1 > delDel
        System.out.println("21- Warmup-1 > delDel-----------------------------");
        System.out.println(delDel("принят"));
        System.out.println(delDel("a"));
        System.out.println(delDel("аdelу"));
        System.out.println(delDel("hi уау"));
        System.out.println(delDel("kitten"));
        System.out.println(delDel("hi"));
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("hdeli there"));
        //22 Warmup-1 > mixStart
        System.out.println("22- Warmup-1 > mixStart-----------------------------");
        System.out.println(mixStart("аdelу"));
        System.out.println(mixStart("hix уау"));
        System.out.println(mixStart("kixtten"));
        System.out.println(mixStart("hix"));
        System.out.println(mixStart("adelbc"));
        System.out.println(mixStart("a"));
        System.out.println(mixStart("ab"));
        System.out.println(mixStart("mix"));
        //23 Warmup-1 > startOz
        System.out.println("23- Warmup-1 > startOz-----------------------------");
        System.out.println(startOz("аdelу"));
        System.out.println(startOz("hzx уау"));
        System.out.println(startOz("kixtten"));
        System.out.println(startOz("hix"));
        System.out.println(startOz("adelbc"));
        System.out.println(startOz("a"));
        System.out.println(startOz("z"));
        System.out.println(startOz("o"));
        System.out.println(startOz("ab"));
        System.out.println(startOz("oz"));
        System.out.println(startOz("ozx"));
        //24 Warmup-1 > intMax
        System.out.println("24- Warmup-1 > intMax----------------------------");
        System.out.println(intMax(9, 110, 15));
        System.out.println(intMax(40, 15, 6));
        System.out.println(intMax(20, 40, 9));
        System.out.println(intMax(19, 50, 35));
        System.out.println(intMax(10, 12, 14));
        //25 Warmup-1 > close10
        System.out.println("25- Warmup-1 > close10----------------------------");
        System.out.println(close10(13, 99));
        System.out.println(close10(21, 19));
        System.out.println(close10(13, 40));
        System.out.println(close10(19, 15));
        System.out.println(close10(10, 12));
        System.out.println(close10(13, 7));
        //26 Warmup-1 > in3050
        System.out.println("26 Warmup-1 > in3050----------------------------");

    }
}
