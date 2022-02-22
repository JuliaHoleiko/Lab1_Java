package com.company;

public class Main {

    public static void main(String[] args) {
        Camera canonG = new Camera();
        Camera canonF = new Camera("Canon", 2344, 12);
        Camera sonyS = new Camera("Sony", 1200, 15, 1.02, true, "black");
        System.out.println(canonG);
        System.out.println(canonF);
        System.out.println(sonyS);

    }
}
