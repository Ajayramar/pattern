package com.company;

public class Main {

    public static void main(String[] args) {
        int s=4;
        for(int i=0; i<s; i++){
            for(int j=i; j<s-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<s; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=i; k<s; k++){
                System.out.print("* ");
            }
            for(int l=i; l<s-1; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
