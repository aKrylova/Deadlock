/*
Написать программу, приводящую к ситуации взаимной блокировки (deadlock).
*/

//TODO: lab9

package org.suai;
import org.suai.threads.*;

public class Main {

    public static void main(String[] args) {
        final Integer num1 = 11;
        final Integer num2 = 30;

        Thread1 th1 = new Thread1(num1, num2);
        Thread2 th2 = new Thread2(num1, num2);
        th1.start();
        th2.start();

    }
}
