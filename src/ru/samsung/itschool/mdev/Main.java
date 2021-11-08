package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();


        // Реализация интерфейса через анонимный класс

        Calculable calculable = new Calculable() {
            @Override
            public void calc(int a, int b) {
                System.out.println(a * a + b * b);
            }
        };
        calculable.calc(5,10);


    }
}
