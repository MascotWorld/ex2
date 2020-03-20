package com.example.example2;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class main {

    public static void main(String[] args){

        int[] price = new int[]{5,100,20,66,16};
        int discount = 50;
        int offset = 1;
        int readlength = 3;

        int[] newPrice = decryptData(price,discount,offset,readlength);
        for (int i = 0;i<newPrice.length;i++){
             System.out.println( newPrice[i] );
        }

    }

    public static @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 99) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {

        int[] newPrice = new int[readLength];

        float disc = (float)discount/100;
        for (int i = 0;i<readLength;i++){
            newPrice[i] = Math.round(price[(i+offset)]*disc);
        }


        return newPrice;
    }

}
