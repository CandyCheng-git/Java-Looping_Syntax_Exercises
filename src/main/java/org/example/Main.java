package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Question 1:
        // Answer = 18
        int z = 0;
        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 3; y++){
                z += x;
            }
        }
        System.out.println(z); //
    }
}