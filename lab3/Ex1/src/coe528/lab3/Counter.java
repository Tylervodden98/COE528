package coe528.lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public interface Counter {
    //curret value of this Counter as a String of digits.
    String count();
    //Increment this Counter.
    void increment();
    //Decrement this Counter.
    void decrement();
    //Reset this Counter.
    void reset();
    
    
}
