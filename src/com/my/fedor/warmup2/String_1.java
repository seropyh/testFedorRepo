package com.my.fedor.warmup2;

public class String_1 {
//33 String-1 -withoutX2
//32 String-1 -withoutX
//31String-1 -startWord
//30 String-1 -deFront
//29 String-1 -without2
//28 String-1 -extraFront
//27 String-1 -minCat
//26 String-1 -frontAgain
//25 String-1 -seeColor
//24 String-1 -lastTwo
//23 String-1 -conCat
//22 String-1 -lastChars
//21 String-1 -atFirst
//20 String-1 -hasBad
//19 String-1 -middleThree
//18 String-1 -twoChar
//17   String-1 -nTwice

//16 String-1 -endsLy
public boolean endsLy(String str) {
if (str.length()>=2 && str.substring(str.length()-2, str.length()).equals("ly")) return true;
else return false;

}
//15 String-1 -middleTwo
public String middleTwo(String str) {
return str.substring(str.length()/2-1,str.length()/2+1 );
}
//14 String-1 -withouEnd2
public String withouEnd2(String str) {
    if (str.length()>1){
        return str.substring(1,str.length()-1) ;
    }else
        return "";
}
//13 String-1 -theEnd
public String theEnd(String str, boolean front) {
    if (front) {
        return str.substring(0, 1);
    }else  return str.substring(str.length()-1, str.length());
}
//12 String-1 -right2
public String right2(String str) {
    return str.substring(str.length()-2,str.length())+ str.substring(0,str.length()-2);
}
//11 String-1 -left2
public String left2(String str) {
return str.substring(2)+ str.substring(0,2);
}
    //10 String-1 - nonStart
public String nonStart(String a, String b) {
return a.substring(1)+ b.substring(1);
}
//9 String-1 - comboString
public String comboString(String a, String b) {
    String c ="";
    String d ="";
    if (a.length() > b.length()){
        d=a; c=b;
    }else {
        d=b; c=a;
    }
    return c+d+c;
}
//8 String-1 - withoutEnd
public String withoutEnd(String str) {
return str.substring(1,str.length()-1);
}
//7 String-1 - firstHalf
public String firstHalf(String str) {
return str.substring(0,str.length()/2);
}
//6 String-1 - firstTwo
public String firstTwo(String str) {
    if (str.length() <2) return str;
    return str.substring(0,2);
}
//5 String-1 - extraEnd
public String extraEnd(String str) {
return str.substring(str.length()-2,str.length()) +str.substring(str.length()-2,str.length()) +str.substring(str.length()-2,str.length());
}
//4 String-1 - makeOutWord
public String makeOutWord(String out, String word) {
return out.substring(0,2)+word + out.substring(2,4);
}

//3 String-1 -makeTags
public String makeTags(String tag, String word) {
return "<"+tag+">"+word + "</"+tag+">";
}
//2 String-1 -makeAbba
public static String makeAbba(String a, String b) {
return a+b+b+a;
}
//1 String-1 - helloName
public static String helloName(String name) {
    return "Hello " + name + "!";
}
    public static  void main (String[] args) {
        System.out.println("String-1" );
    }
}
