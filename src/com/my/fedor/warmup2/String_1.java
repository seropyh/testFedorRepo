package com.my.fedor.warmup2;

public class String_1 {
//33 String-1 -withoutX2
public static String withoutX2(String str) {
    String res=str;
    int flg =0;
    if (str.length()==0) return "";
    if (str.substring(0,1).equals("x") ) {
        res = res.substring(1);flg =1;
    }
    if (str.length() >=2 && str.substring(1,2).equals("x") ) {
        if ( flg ==1 ){
        res = res.substring(1);
        }else {
        res= res.substring(0,1) +  res.substring(2);
        }

        return res;
    }
    return res;
}
//32 String-1 -withoutX
public String withoutX(String str) {
    if (str.length()<2) return "";
    String res=str;
    if (str.substring(0,1).equals("x") ) res = res.substring(1);
    if (str.substring(str.length()-1,str.length()).equals("x") )
        res = res.substring(0,res.length()-1);
    return res;
}
//31String-1 -startWord
public static String startWord(String str, String word) {
    if (str.length() < word.length() ) return "";
    if (str.substring(1,word.length()).equals(word.substring(1)))
        return str.substring(0,word.length());
    return "";
}

//30 String-1 -deFront
public String deFront(String str) {
    String res ="";

    if (str.length()>0 && str.substring(0,1).equals("a")) res="a";
    if (str.length()>1 && str.substring(1,2).equals("b")) res=res +"b";
    if (str.length()>=2) return res + str.substring(2);
    return "";
}
//29 String-1 -without2
public String without2(String str) {
    if (str.length()<2) return "";
    if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
        return str.substring(2);
    }

    return str;
}

    //28 String-1 -extraFront
public String extraFront(String str) {
    if (str.length()<=3) {
    return  str+str + str;
    }
    else  return str.substring(0,3) + str.substring(0,3)+str.substring(0,3);

}

//27 String-1 -minCat
public static String minCat(String a, String b) {
 if (a.length()>b.length()){
     return a.substring(a.length()-b.length()) + b;
 }else{
     return a + b.substring(b.length()-a.length());}

 }
//26 String-1 -frontAgain
public boolean frontAgain(String str) {
 if (str.length()<2) return false;
 if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) return true;
 return false;
}

    //25 String-1 -seeColor
public String seeColor(String str) {

    if (str.length()>=3 && str.substring(0,3).equals("red")  ) {return  "red";}
    if (str.length()>=4 && str.substring(0,4).equals("blue") ) {return  "blue";}
    return "";

}
//24 String-1 -lastTwo
public String lastTwo(String str) {
    if (str.length()<2) return str;
return str.substring(0,str.length()-2) + str.substring(str.length()-1,str.length()) + str.substring(str.length()-2,str.length()-1);
}

    //23 String-1 -conCat
public String conCat(String a, String b) {

    if(a.length()==0 || b.length()==0) return a+b;
    if (a.substring(a.length()-1,a.length()).equals(b.substring(0,1)) ) return  a.substring(0,a.length()-1) + b;
    return a+b;
}
//22 String-1 -lastChars
public static String lastChars(String a, String b) {
    String newStr ="";
    if (a.length()==0) newStr ="@";
    else newStr = a.substring(0,1);
    if (b.length()==0) newStr = newStr +"@";
    else newStr = newStr + b.substring(b.length()-1,b.length());
    return newStr;
}
//21 String-1 -atFirst
public String atFirst(String str) {
    if(str.length()==0) return "@@";
    if(str.length()==1) return str + "@";
    return str.substring(0,2);
}
//20 String-1 -hasBad
public static boolean hasBad(String str) {

    if ( (str.length()>=3 && str.substring(0,3).equals("bad") )|| ( str.length()> 3 &&   str.substring(1,4).equals("bad") ) ){
     return true;
 }else return false;

}
//19 String-1 -middleThree
public static String middleThree(String str) {
    int ind = str.length()/2;
    //if (str.length()==3) return  str.substring(ind-1, ind+2);
    return str.substring(ind-1, ind+2);
}
//18 String-1 -twoChar
public static  String twoChar(String str, int index) {
    if (index>str.length() - 2 || index <0) {
        return str.substring(0,2);
    }else
        return str.substring(index,index+2);

}
//17   String-1 -nTwice
public String nTwice(String str, int n) {
return str.substring(0,n)+ str.substring(str.length()-n, str.length());
}
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
      /*  System.out.println("String-1" );
        System.out.println( twoChar("java",0));
        System.out.println( twoChar("java",2));

        System.out.println( twoChar("java",3));


        System.out.println( middleThree("Javas"));
        System.out.println( middleThree("and"));
        System.out.println( middleThree("Candy"));
        System.out.println( middleThree("solving"));
        System.out.println( middleThree("123456789"));

        System.out.println( hasBad("1bad" ));

        System.out.println( lastChars("last","chars"));

        System.out.println( lastChars("yo","java"));
        System.out.println( lastChars("yo",""));


        System.out.println(minCat("1sdcsddvfdfdvbnn", "123121rt"));


        System.out.println(startWord("hippo","hi"));
        System.out.println(startWord("hippo","xip"));
        System.out.println(startWord("hippo","i"));


       */
        System.out.println(withoutX2("x"));
    }
}
