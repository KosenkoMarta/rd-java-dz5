public class Main {

    public static void main(String[] args) {

        int apples = 2;
        int bananas = 4;
        int kiwi = 3;
        int peaches = 5;

        int s1 = apples + bananas;
        int s2 = kiwi + peaches;

        System.out.println(s2 > s1);

        s1++;
        s2 -= 2;

        System.out.println(s1 > s2);

        System.out.println(s1 % 2 == 0 || s2 % 2 == 0);
    }
}
