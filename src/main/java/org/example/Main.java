package org.example;

public class Main {
    public static void main(String[] args) {

        //TIP Question 1:
        int z = 0;
        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 3; y++){
                z += x;
            }
        }
        System.out.println(z);
            //TIP Answer = 18
    }
}