package org.example.arrays.string;

public class PatternSearching {

    public static void main(String[] args){
        checkStringPatternMatching("ABABAABABBA","BA");
    }

    //ABABAABABBA
    // BAAB
    private static void checkStringPatternMatching(String str,String pat){

        boolean isMatched =false;
        for(int i=0;i<str.length()-pat.length();i++){
            int count=0;
            for(int j=0;j<pat.length();j++){
                if(str.charAt(i+j) == pat.charAt(j)){
                    count=count+1;
                }else{
                    break;
                }
            }
            if(count==pat.length()){
                isMatched=true;
                System.out.println("Matching pattern found at -->"+i);
            }
        }
        if(!isMatched){
            System.out.println("No  matching pattern is  found");
        }
    }

}
