package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{

    public int testMethod(int a, int b){
        return a;
    }

    public boolean testFalse(int a , int b){
        return a < b;
    }

    public int testNotNull(int a, int b){
        return a + b;
    }

    public static int blackJack(int x, int y){
        if (x > 21 && y > 21){
            return 0;
        }else if (x > 21){
            return y;
        }else if (y > 21) {
            return x;
        }else if (x > y){
            return x;
        }else{
            return y;
        }
    }
}
