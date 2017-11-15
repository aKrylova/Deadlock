package org.suai.threads;

public class Thread1 extends Thread {
    private Integer number1;
    private Integer number2;

    public Thread1(Integer n1, Integer n2){
        number1 = n1;
        number2 = n2;
    }

    @Override
    public void run(){
        synchronized (number1){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            synchronized (number2){
                System.out.println("in thread 1");
            }
        }
    }
}
