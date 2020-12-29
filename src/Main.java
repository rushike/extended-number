
import extended_number.Fraction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5,15);
        Fraction f2 = new Fraction(6,15);
        System.out.println(f1.simple_frac());
        System.out.println(f2.simple_frac());
        System.out.println(f1.add(f2));
        System.out.println(f1.gcd(1421, 1435));
    }
}
