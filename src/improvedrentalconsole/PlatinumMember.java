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
public class PlatinumMember extends GoldMember{
    
    private int bonus;
    
    PlatinumMember() {
        setRentCost(45000);
        setPoint(10);
        setDisc(3);
        setCashback(10000);
    }
    
    //getter method
    public int getBonus(int rentalDuration) {
        
        this.bonus = rentalDuration * 5000;
        return bonus;
    }
}
