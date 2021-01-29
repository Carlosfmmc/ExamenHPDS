package model;

public class Analizer {
    public int[] analyze(int i0, int i1, int i2) {
        int[] r = new int[2];
        r[0]= 0;
        r[1]= 0;
        for(int i = i0; i<=i1; i++){
            if(sumOfDigitsAreGreater(i, i2)){
                r[0]++;
                r[1] +=i;
            }
        }
        return r;
    }

    private boolean sumOfDigitsAreGreater(int i, int maxSum) {
        int[] digits;
        if(i<10000){
            digits = new int[4];
            for (int j = 0; j<3; j++){
                digits[j]=i%10;
                i = i/10;
            }
            return sum(digits)<maxSum;
        }else{
            digits = new int[5];
            for (int j = 0; j<4; j++){
                digits[j]=i%10;
                i = i/10;
            }
            int[] digits2=new int[4];
            for (int j = 0; j<3; j++){
                digits2[j]=digits[j+1];
            }
            return sum(digits)<maxSum||sum(digits2)<maxSum;
        }

    }

    private int sum(int[] digits) {
        int r = 0;
        for(int i=0; i<3; i++){
            r += digits[i];
        }
        return r;
    }
}