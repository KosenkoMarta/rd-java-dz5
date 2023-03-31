public class Main {

    public static void main(String[] args) {

        int apples = 2;
        int bananas = 4;
        int kiwi = 3;
        int peaches = 5;

        int s1 = apples + bananas;
        int s2 = kiwi + peaches;

        String fstComp = s2>s1 ? "true" : "false";
        System.out.println(fstComp);
        //or System.out.println(s2 > s1);

        s1++;
        --s2;
        --s2; //or s2 -= 2; instead of 18-19

        String sndComp = s1>s2 ? "true" : "false";
        System.out.println(sndComp);
        //or System.out.println(s1 > s2);

        String result = s1 % 2 == 0 ^ s2 % 2 == 0 || s1 % 2 == 0 && s2 % 2 == 0 ? "true" : "false";
        System.out.println(result);
    }
}
