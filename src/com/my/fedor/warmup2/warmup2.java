package com.my.fedor.warmup2;
//https://codingbat.com/java
public class warmup2 {
    // 17  Warmup-2 >has271
    public static boolean has271(int[] nums) {
        for (int i =0;i< nums.length-2; i++){
            if ( nums[i] + 5 == nums[i+1] && Math.abs(nums[i+2] - (nums[i]-1)) <= 2) {
                return true;
            }
        }
    return false;
    }
    // 16 Warmup-2 >noTriples
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i<nums.length-2;i++){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
    //15 Warmup-2 > array667
    public static int array667(int[] nums) {
        int cnt=0;
        for (int i=0;i< nums.length-1;i++)
        {
            if (nums[i]==6 && (nums[i+1] ==6 || nums[i+1]==7 )){
                cnt++;
            }
        }
  return cnt;
    }
    // 14 Warmup-2 > stringYak
    public static  String stringYak(String str) {
    String res= "";
    for (int i=0;i<str.length(); i++){
        if ( str.substring(i, i+1).equals("y") && i<str.length()-2 && str.substring(i+2, i+3).equals("k")){
            i+=2;continue;
        }
        res =res+str.substring(i, i+1);
    }
      return res;
    }

    // 13 Warmup-2 > altPairs
    public  static String altPairs(String str) {
        String res = "";
        for (int i=0; i<str.length(); i += 4) {
            int schar = i + 2;
            if (schar > str.length()) {
                schar = str.length();
            }
            res = res + str.substring(i, schar);
        }

        return res;
    }

    // 12 Warmup-2 > stringX
    public static String stringX(String str) {
        String res = "";
        for (int i = 0; i < str.length() ; i++) {
            if (!( i > 0 && i < str.length()-1 &&  str.substring(i, i + 1).equals("x"))) {
                res = res + str.substring(i, i + 1);
            }
        }
        return res;
    }


    //11 Warmup-2 > stringMatch
    public static int stringMatch(String a, String b) {
        int cnt =0;
        int mylen=Math.min(a.length(),b.length());
        for (int i = 0; i< mylen-1; i++){
            if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
                cnt++;
            }
        }
    return cnt;
    }
    // 10 Warmup-2 > array123
    public static boolean array123(int[] nums) {
        int ind=0;
        for (int i=0;i< nums.length; i++){
            if (nums[i] == 1) ind=i;
            if(ind+1 == i &&  nums[i] == 2 )  ind =i;
            if(ind+1 == i &&  nums[i] == 3 )  return true;
        }
    return false;
    }
    // 9 Warmup-2 > arrayFront9
    public static boolean arrayFront9(int[] nums) {
        int nlen =0;
        if (nums.length>4 ) {
            nlen=4;
        }
        else {
            nlen = nums.length;
        }
    for (int i=0;i<nlen ;i++){
        if (nums[i] ==9)
            return true;
    }
    return false;
    }
    //8 Warmup-2 > arrayCount9
    public static  int arrayCount9(int[] nums) {
    int cnt =0;
        for (int i=0;i< nums.length; i++){
            if (nums[i] ==9){
                cnt++;
            }
        }
        return cnt;
    }
    // 7 Warmup-2 > last2
    public static int last2(String str) {
    int res =0;
    if (str.length()>2) {
        for (int i=0; i<str.length()-2;i++){
          if ( (str.substring(i,i+1).equals(str.substring(str.length() - 2, str.length() - 1))) &&
                  str.substring(i+1,i+2).equals( str.substring(str.length() - 1, str.length() )) ){
              res++;
          }
        }
    }
    return res;
    }
    // 6 Warmup-2 > stringSplosion
    public static String stringSplosion(String str) {
    String nStr="";
        for (int i=0; i<str.length(); i++) {
            nStr = nStr + str.substring(0,i+1);
        }
    return nStr;

    }

    // 5 Warmup-2 > stringBits
    public static String stringBits(String str) {
        String nStr = "";
        for (int i=0; i<str.length(); i+=2) {
            nStr = nStr + str.substring(i, i+1);
        }
        return nStr;
    }

    // 4 Warmup-2 > doubleX
    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.substring(i, i + 2).equals("xx")) {
                return true;
            }
        }
        return false;
    }
    //3 Warmup-2 > countXX
    public static int countXX(String str) {
        int cnt =0;
        for(int i = 0; i<str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) {
                cnt++;
            }
        }
        return cnt;
    }
    //2 Warmup-2 > frontTimes
    public static String frontTimes(String str, int n) {
        String nStr="";
        for (int i = 0; i<n; i++){
            if (str.length() <=3) {
                nStr = nStr + str;
            }
            else
            nStr = nStr + str.substring(0,3);
        }
        return nStr;
    }
    //1 Warmup-2 > stringTimes
    public static String stringTimes(String str, int n) {
        String mStr="";
        for (int i =0; i< n; i++){
            mStr = mStr + str;
        }
    return mStr;
    }
    public static  void main (String[] args)
    {

        // 1  Warmup-2 > stringTimes
        System.out.println("1 Warmup-2 > stringTimes" );
        System.out.println(stringTimes("a",3 ));
        System.out.println(stringTimes("aa",2 ));
        System.out.println(stringTimes("Hi",2 ));
        System.out.println(stringTimes("Hi",3 ));
        System.out.println(stringTimes("Hi",1 ));
        // 2 Warmup-2 > frontTimes
        System.out.println("2 Warmup-2 > frontTimes" );
        System.out.println(frontTimes("abc",3 ));
        System.out.println(frontTimes("chocolate",2 ));
        System.out.println(frontTimes("chocolate",3));
        System.out.println(frontTimes("Hithere",3 ));
        System.out.println(frontTimes("a",3 ));
        // 3 Warmup-2 > countXX
        System.out.println("3 Warmup-2 > countXX" );

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("abxxcdfgxx"));
        System.out.println(countXX("chocolaxxte"));
        System.out.println(countXX("chxxocolate"));
        System.out.println(countXX("Hxxitxxherexx" ));
        System.out.println(countXX("x"));
        System.out.println(countXX("xx"));
        // 4 Warmup-2 > doubleX
        System.out.println("4 Warmup-2 > doubleX" );
        System.out.println(doubleX("xaxx"));
      //  System.out.println(doubleX("axaxax"));
      //  System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("xaxxx"));
     //   System.out.println(doubleX("chocolaxxte"));
     //   System.out.println(doubleX("chxxocolate"));
     //   System.out.println(doubleX("Hxxitxxherexx" ));
     //   System.out.println(doubleX("x"));
     //   System.out.println(doubleX("xx"));
  /*      // 5 Warmup-2 > stringBits
        System.out.println("5 Warmup-2 > stringBits" );
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringBits("abxxcdfgxx"));
        System.out.println(stringBits("chocolaxxte"));
        System.out.println(stringBits("chxxocolate"));
        System.out.println(stringBits("Hxxitxxherexx" ));
        System.out.println(stringBits("x"));
        System.out.println(stringBits("xx"));
        // 6 Warmup-2 > stringSplosion
         System.out.println("6 Warmup-2 > stringSplosion" );
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc" ));
        System.out.println(stringSplosion("x"));
        System.out.println(stringSplosion("ab"));
        // 7 Warmup-2 > last2
        System.out.println("7 Warmup-2 > last2" );
        System.out.println(last2("Caaodxaa"));
        System.out.println(last2("hixxhi" ));
        System.out.println(last2("xdxxadvsdxfsnhdxngxadx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("xdc"));
        // 8 Warmup-2 > arrayCount9
        System.out.println("8 Warmup-2 > arrayCount9" );
        int[] arr1 ={1, 2, 9};
        int[] arr2 ={1, 9, 9};
        int[] arr3 ={1, 9, 9, 3, 9};
        System.out.println(arrayCount9(arr1) );
        System.out.println(arrayCount9(arr2) );
        System.out.println(arrayCount9(arr3) );
        // 9 Warmup-2 > arrayFront9
        System.out.println("9 Warmup-2 > arrayFront9" );
        int[] arrf91 ={1, 2, 9, 3, 4};
        int[] arrf92 ={1, 2, 3, 4, 9};
        int[] arrf93 ={1, 2, 3, 4, 5};
        System.out.println(arrayFront9(arrf91) );
        System.out.println(arrayFront9(arrf92) );
        System.out.println(arrayFront9(arrf93) );
        // 10 Warmup-2 > array123
        int[] arr1231 ={1, 2, 9, 3, 4};
        int[] arr1232 ={1, 2, 3, 4, 9};
        int[] arr1233={4, 2, 1,2, 4};
        int[] arr1234={41, 1, 2, 3, 1};
        int[] arr1235={1, 1, 2, 4, 1};
        int[] arr1236={1, 1, 2, 1, 2, 3};
        System.out.println("10 Warmup-2 > array123" );
        System.out.println(array123(arr1231) );
        System.out.println(array123(arr1232) );
        System.out.println(array123(arr1233) );
        System.out.println(array123(arr1234) );
        System.out.println(array123(arr1235) );
        System.out.println(array123(arr1236) );
        // 11 Warmup-2 > stringMatch
        System.out.println("11 Warmup-2 > stringMatch" );
        System.out.println(stringMatch("xxcaazz","xxbaaz"));
        System.out.println(stringMatch("abc" , "abc"));
        System.out.println(stringMatch("abc" , "axc"));
        // 12 Warmup-2 > stringX
        System.out.println("12 Warmup-2 > stringX" );
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd" ));
        System.out.println(stringX("xabxxxcdx" ));
        // 13 Warmup-2 > altPairs
        System.out.println("13 Warmup-2 > altPairs" );
        System.out.println(altPairs("xxHxix"));
        System.out.println(altPairs("abxxxcd" ));
        System.out.println(altPairs("xabxxxcdx" ));
        // 14 Warmup-2 > stringYak
        System.out.println("14 Warmup-2 > stringYak " );
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak" ));
        System.out.println(stringYak("yak123ya" ));
        //15 Warmup-2 > array667
        System.out.println("15 Warmup-2 > array667 " );
        int[] arr1531 ={6, 6, 2, 3, 4};
        int[] arr1532 ={6, 6, 2, 6, 9};
        int[] arr1533={6, 7, 6,2, 4};
        int[] arr1534={41, 1, 6, 7, 1};
        int[] arr1535={1, 1, 2, 4, 1};
        int[] arr1536={1, 1, 2, 1, 2, 3};

        System.out.println(array667(arr1531) );
        System.out.println(array667(arr1532) );
        System.out.println(array667(arr1533) );
        System.out.println(array667(arr1534) );
        System.out.println(array667(arr1535) );
        System.out.println(array667(arr1536) );
        // 16 Warmup-2 >noTriples
        System.out.println("16 Warmup-2 > noTriples " );
        int[] arr1631 ={1, 1,2, 2, 1};
        int[] arr1632 ={1, 1, 2, 2, 2,1};
        int[] arr1633={1,1,1,2,2,2,1};
        int[] arr1634={41, 1, 6, 7, 1};
        int[] arr1635={1, 1, 2, 4, 1};
        int[] arr1636={1, 1, 2, 1, 2, 3};
        System.out.println(noTriples(arr1631) );
        System.out.println(noTriples(arr1632) );
        System.out.println(noTriples(arr1633) );
        System.out.println(noTriples(arr1634) );
        System.out.println(noTriples(arr1635) );
        System.out.println(noTriples(arr1636) );
        // 17  Warmup-2 >has271
        System.out.println("17 Warmup-2 > has271 " );
        int[] arr171 ={1, 2, 7, 1};
        int[] arr172 ={1, 2, 8, 1};
        int[] arr173={2, 7, 1};
        System.out.println(has271(arr171) );
        System.out.println(has271(arr172) );
        System.out.println(has271(arr173) );
*/
    }
}
