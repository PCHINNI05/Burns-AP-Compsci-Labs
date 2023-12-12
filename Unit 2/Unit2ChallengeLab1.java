import java.util.*;

public class Main {
    public static void main (String[] args) {
        
        Scanner S1 = new Scanner(System.in);
        
        System.out.println("Enter a dollar value with cents as decimals");
        double money = S1.nextDouble();
        
        double hd = money / 100;
        double fy = (money - ((int)hd * 100))/50;
        double tn = ((money - ((int)hd * 100)) - ((int)fy * 50))/10;
        double fe = (((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10))/5;
        double oe = ((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5))/1;
        double hr = (((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5)) - ((int)oe * 1))/.5;
        double qr = ((((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5)) - ((int)oe * 1)) - ((int)hr * .5))/.25;
        double de = (((((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5)) - ((int)oe * 1)) - ((int)hr * .5)) - ((int)qr * .25))/.1;
        double nl = ((((((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5)) - ((int)oe * 1)) - ((int)hr * .5)) - ((int)qr * .25)) - ((int)de * .1))/.05;
        double py = (((((((((money - ((int)hd * 100)) - ((int)fy * 50)) - ((int)tn * 10)) - ((int)fe * 5)) - ((int)oe * 1)) - ((int)hr * .5)) - ((int)qr * .25)) - ((int)de * .1)) - ((int)nl * .05))/.01;
        
        System.out.println("The money amount you provided has: \n" + (int) hd + " hundred dollar bills \n" + (int) fy + " fifty dolar bills \n" + (int) tn + " ten dollar bills \n" + (int) fe + " five dollar bills \n" + (int) oe + " one dollar bills \n" + (int) hr + " half dollars \n" + (int) qr + " quarters \n" + (int) de + " dimes \n" + (int) nl + " nickels and \n" + (int) py + " pennies");
        
    }
    
}
