package com.practice.problems;

public class AccMainPalindromeSolution {

    public static void main(String[] args){

        int result = AccMainPalindromeSolution.checkPalindrome(876);
        System.out.println(result);
    }

    public static int checkPalindrome(int n){

        int org = n;
        int rev_n = 0;

        while(n!= 0){
            int num = n%10;
            rev_n = rev_n*10+num;
            n/=10;
        }
        int both_sum = org + rev_n;
        String s = Integer.toString(both_sum);
        int low = 0; int high = s.length()-1;
        int flag = 0;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                flag = 1;
                break;
            }
            low++;
            high--;
        }

        if(flag != 0){
            return checkPalindrome(both_sum);
        }
        return both_sum;
    }
}