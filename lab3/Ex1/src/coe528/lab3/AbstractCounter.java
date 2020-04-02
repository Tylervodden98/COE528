/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 *
 * @author Tyler
 */
public abstract class AbstractCounter implements Counter {
    int val;
    
    public AbstractCounter(){
         val=0;
    }
    
    @Override
     public void reset(){
         val=0;
         //resets counter
    }
     
    @Override
    public String count(){
        return ("" + this.val);
    }
}