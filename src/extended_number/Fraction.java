/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extended_number;
import java.math.BigInteger;
/**
 *
 * @author rushi
 */
public class Fraction extends Operations{
    /**
     * Fraction representation
     */
    private long x;
    private long y;
    
    public Fraction(){
        this.x = 0 ;
        this.y = 1;
    }
    public Fraction(long x, long y){
        this.x = x;
        this.y = y;
    }
   
    BigInteger i = new BigInteger("2");
    
    public Fraction add(Fraction frac){
        if(frac.y == y) return new Fraction((frac.x + x),y);
        else return new Fraction((y*frac.x + x*frac.y), (y*frac.y));
    }
    public Fraction subtract(Fraction frac){
        return add(new Fraction((x * -1), y ));
    }
    public Fraction multiply(Fraction frac){
        return new Fraction((x*frac.x), y*frac.y);
    }
    public Fraction divide(Fraction frac){
        return multiply(new Fraction(frac.y, frac.x));
    }
    
    /**
     * If a / b = 4 / 12 = 1 / 3
     * @return Fraction simplified
     */
    public Fraction simple_frac(){
        long a = x, b = y;
        /**
         * Swap if a > b
         */
        if(x > y) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        long g = gcd(a, b);
        return new Fraction(x/g, y/g);
    }
    /**
     * a &gt b
     * gcd(a, q)
     * Using Euclid Algorithm
     * a = q * m + r
     * q = r * m1 + r1;
     * if r_i = 0 terminate return q
     * @param a first number
     * @param q second number
     * @return q
     */
    public long gcd(long a, long q ){
        if(a % q == 0){
            return q;
        }return gcd(q, a % q);
    }
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object frac){
        Fraction a = (Fraction)frac;
        if(a.x == this.x && a.y == this.y) return true;
        return false;
    }
    
    @Override
    public String toString(){
        return "[{"+this.x+"}"+", {"+this.y+"}]";
    }
}
/*Getters and Setters
 protected long getX() {
        return x;
    }
    protected long getY() {
        return y;
    }
    protected void setX(int x) {
        this.x = x;
    }
    protected void setY(int y) {
        this.y = y;
    }
*/