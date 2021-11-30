/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedrentalconsole;

/**
 *
 * @author Predator
 */
public class GoldMember extends SilverMember {
    
    private int cashback;
    
    // setter method
    public void setCashback(int cb) {
        this.cashback = cb;
    }
    
    //getter method
    public int getCashback() {
        return this.cashback;
    }
    
    
    // constructor
    GoldMember() {
        setRentCost(30000);
        setPoint(5);
        setDisc(2);
        setCashback(5000);
    }
}
