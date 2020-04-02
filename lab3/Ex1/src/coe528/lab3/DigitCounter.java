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
public class DigitCounter extends AbstractCounter{
    
    public DigitCounter(int val){
        //initialize val
        this.val=val;
    }
    
    @Override
    public void increment(){
        if(val<9){
            val++;
        }
        else {
            val=0;
        }
    }
    
    
    @Override
    public void decrement(){
        if(val>0){
            val--;
        }
        else{
            val=9;
        }
    }
}    
