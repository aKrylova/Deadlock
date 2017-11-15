package org.suai.threads;

public class Thread2 extends Thread{
    private Integer number1;
    private Integer number2;

    public Thread2(Integer n1, Integer n2){
        number1 = n1;
        number2 = n2;
    }

    @Override
    public void run(){
        synchronized (number2){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            synchronized (number1){
                System.out.println("in thread 2");
            }
        }
    }
}
