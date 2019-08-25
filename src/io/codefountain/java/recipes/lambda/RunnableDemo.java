package io.codefountain.java.recipes.lambda;

public class RunnableDemo {

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName()+": Runnable Demo");
        };

        new Thread(r).start();


    }
}
