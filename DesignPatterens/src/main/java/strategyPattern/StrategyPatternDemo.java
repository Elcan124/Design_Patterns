/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

/**
 *
 * @author elcan
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        System.out.println("10+5 = "+ context1.executeStrategy(10, 5));
        Context context2 = new Context(new OperationSubstract());
        System.out.println("10-5 = "+ context2.executeStrategy(10, 5));
        Context context3= new Context(new OperationMultiply());
        System.out.println("10 x 5 = "+ context3.executeStrategy(10, 5));
        
    }
    
}
