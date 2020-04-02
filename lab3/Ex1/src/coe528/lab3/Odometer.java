/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

import java.util.LinkedList;

/**
 *
 * @author Tyler
 */
public class Odometer extends AbstractCounter{
    //declare int n, first counter in the odometer, the rest of the counters in odometer, using linked list to implement odometer.
    private int n;
    private DigitCounter first;
    private LinkedDigitCounter restofdigits;
    LinkedList<Counter> Odometer;
    
    
    public Odometer(int n){
        if(n<1){
            throw new IllegalArgumentException("Number of digits in odometer must be at least 1");
        }
        
        //initialize n
        this.n=n;
        //initialize odometer list
        Odometer = new LinkedList<>();
        //initialize first digit counter
        first = new DigitCounter(0);
        //put first into first element of linked list odometer
        Odometer.add(first);
        
        if (n>1){
            //links LinkedDigitCounter to DigitCounter (first)
            restofdigits = new LinkedDigitCounter(first);
            Odometer.add(restofdigits);
            
            for(int i=2;i<n;i++){
              //creates rest of linked list digits up to n-1
              restofdigits = new LinkedDigitCounter(restofdigits);
              Odometer.add(restofdigits);
            }
        }
            
    }
    
    @Override
    public String count(){
        String odometerval="";
        
        for(Counter x : Odometer){
            odometerval=odometerval+ x.count();
            //makes a string for values of linked list Odometer
        }
       return odometerval; 
    }
    
    @Override
    public void increment(){
        //gets last element of Odometer and increments it
        Odometer.getLast().increment();
    }
    
    @Override
    public void decrement(){
        //gets last element of Odometer and decrements it
        Odometer.getLast().decrement();
    }
    
    @Override
    public void reset(){
        //gets last element of Odometer and resets it
        Odometer.getLast().reset();
    }
    
    
}
