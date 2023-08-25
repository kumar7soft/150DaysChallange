package org.example.arrays;

public class Test {

    public static void main(String[] args){


        int solve = solve(79438016);
        System.out.println(solve);
    }

   static public int solve(int A) {

        String binary = convertToBinary(A);
        int count=0;
        Long number =Long.valueOf(binary);
        while(number != 0){
            Long a = number %10;
            if(a ==0){
                count+=1;
            }else{
                break;
            }
            number=number/10;
        }
        return count;
    }

    private static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            // Extract the rightmost bit and add it to the result
            binary.insert(0, number & 1);
            // Right shift number to check the next bit
            number >>= 1;
        }
        return binary.toString();
    }
}
