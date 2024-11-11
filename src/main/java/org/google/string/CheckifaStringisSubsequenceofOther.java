package org.google.string;

public class CheckifaStringisSubsequenceofOther {

    public static void main(String[] args){
        checkSubStingIsStringOfOthers("ABCDE","AED");

    }
    // A,B,C,D,E
    // A,D,E

    static boolean isSubSeq(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j))
                j++;
        }

        return j == m;
    }
   private static void checkSubStingIsStringOfOthers(String str1,String str2){
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
       int counter = 0;
       for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;){
               if(arr2[j] == arr1[i]){
                   counter++;
                   j++;
                   System.out.println(arr2[j]+"------"+arr1[i]);

               }
           }
       }
       System.out.println(counter);
   }

}
