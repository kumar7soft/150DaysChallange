package org.example.arrays;

public class NextPalindromNumber {

    public static void main(String[] args){

        int number =121+1;
        while(true){
            boolean palindron = isPalindron(number);
            if(palindron) {
                System.out.println(number);
                break;
            }else{
                number+=1;
            }
        }

    }

    private static boolean isPalindron(int n){

        int a =n;
        StringBuilder sb =new StringBuilder();
        while(n !=0){
            sb.append(String.valueOf(n%10));
            n=n/10;
        }
        int i = Integer.valueOf(sb.toString());
        return i==a;
    }
}
