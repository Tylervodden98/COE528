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
public class LinkedDigitCounter extends AbstractCounter{
    private Counter leftNeighbour;
    
    public LinkedDigitCounter(Counter leftneighbour){
        this.leftNeighbour=leftneighbour;
    }
    
    @Override
    public void increment(){
        if(val<9){
            val++;
        }
        else {
            val=0;
            leftNeighbour.increment();
            //increments left neighbour iff val=9, sets val=0
        }
    }
    
    @Override
    public void decrement(){
        if(val>0){
            val--;
        }
        else{
            val=9;
            leftNeighbour.decrement();
            //decrements left neighbour iff val is 0, set val=9
        }
    }
    
    @Override
    public void reset(){
        super.reset();
        //calls abstractcounter reset (resets val=0)
        leftNeighbour.reset();
        //resets left Neighbour (left neighbour val=0)
    }
}
