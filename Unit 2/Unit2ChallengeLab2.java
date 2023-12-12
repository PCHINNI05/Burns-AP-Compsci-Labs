import java.util.*;

public class Main {
    public static void main (String[] args) {

        Random gen = new Random();
        int n1 = gen.nextInt(8);
        int n2 = gen.nextInt(8);
        int n3 = gen.nextInt(8);
        int n456 = gen.nextInt((642) +100);
        int n78910 = gen.nextInt(10000);

        System.out.println("The random number generated is: (" + n1 + n2 + n3 + ") - " + n456 + " - " + n78910);

}

}
