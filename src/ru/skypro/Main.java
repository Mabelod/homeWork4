package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    static void lecture() {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

    }

    static void task1() {

        int[] a = new int[3];
        double[] b = {1.57, 7.654, 9.986};
        boolean[] g = {true, false};

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i]);
            if (i < g.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static void task3() {
        int[] a = new int[3];
        double[] b = {1.57, 7.654, 9.986};
        boolean[] g = {true, false};

        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = i + 1;
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = g.length - 1; i >= 0; i--) {
            System.out.print(g[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static void task4() {
        int[] a = new int[3];
        a[0] = 6;
        a[1] = 2;
        a[2] = 9;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] += 1;
                System.out.print(a[i]);
                if (i < a.length - 1) {
                    System.out.print(", ");}
            } else if (a[i] % 2 == 0) {
                System.out.print(a[i]);
                if (i < a.length - 1) {
                    System.out.print(", ");}
            }
        }
    }
}
