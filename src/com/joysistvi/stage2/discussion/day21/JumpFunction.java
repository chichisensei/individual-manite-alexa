package com.joysistvi.stage2.discussion.day21;

public class JumpFunction {

    void jump(double height) {
        System.out.println("Jumping " + height + " meters high! Double");
    }



    void jump(int noOfJump) {
        System.out.println("Jump 3x");
    }

    void jump(String animation) {
        System.out.println("Performing jump animation: " + animation);
    }

    void jump(int noOfJump, double height) {
        System.out.println("Jump " + noOfJump + " times at " + height + " meters!");
    }

    void jump(String animation, int speed, double height) {
        System.out.println("Performing " + animation + " at speed " + speed + " while jumping " + height + " meters high!");
    }

    public static void main(String[] args) {
        JumpFunction jumpTest = new JumpFunction();
        jumpTest.jump(2.5f);
        jumpTest.jump("jumping jacks",2,3.5);
        jumpTest.jump("Frontflip");
    }
}

// Compile-Time Polymorphism -> Method overloading
// Runtime Polymorphism -> Method overriding
// int long float double Integer Long Float Double