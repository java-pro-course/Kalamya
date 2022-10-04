package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chet = 0;
        int nechet = 0;
        for(int i = 0; i <=100;i++){

            if(i % 2 == 0){
                chet += i;
            }else{
                nechet += i;
            }
        }
        System.out.println(chet);
        System.out.println(nechet);

    }
}
