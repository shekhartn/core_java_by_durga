package com.durga.access_modifiers;
public class Main {
    public native int intMethod(int i);
    public static void main(String[] args) {
        System.loadLibrary("C:\\Users\\shekhar_t\\Shekhar T\\My Projects\\CoreJavaByDurga\\src\\com\\durga\\access_modifiers\\Main");
        System.out.println(new Main().intMethod(2));
    }
}
