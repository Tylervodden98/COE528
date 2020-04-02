/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab4;

import java.util.ArrayList;

public class StackOfDistinctStrings {  
    // Overview: StacksOfDistinctStrings are mutable, bounded       
    // collection of distinct strings that operate in    
    // LIFO (Last-In-First-Out) order.    
    //    // The abstraction function is:   
    // a)Write the abstraction function here    
    //   AF(c) = { a stack of strings with LIFO order
    //      c.top = c.items(items.size()-1) }
    //      
    //
    // The rep invariant is:
    // b)Write the rep invariant here   
    //  RI(c) = c.items has no duplicate strings
    //
    //
    // 
    //the rep
    private ArrayList<String> items;  
    // constructor   
    public StackOfDistinctStrings() {   
    // EFFECTS: Creates a new StackOfDistinctStrings object 
    items = new ArrayList<String>();   
    }
    public void push(String element) throws Exception {     
        // MODIFIES: this       
        // EFFECTS: Appends the element at the top of the stack     
        //          if the element is not in the stack, otherwise     
        //          does nothing.       
        if(element == null) throw new Exception();    
        if(false == items.contains(element))    
            items.add(element);    
    }
    
    public String pop() throws Exception {     
        // MODIFIES: this    
        // EFFECTS: Removes an element from the top of the stack       
        if (items.size() == 0) throw new Exception();   
        return items.remove(items.size()-1);  
    }    public boolean repOK() {        
    // EFFECTS: Returns true if the rep invariant holds for this       
    //          object; otherwise returns false  
    // c) Write the code for the repOK() here   
            for(int x=0;x<=items.size();x++){
                for(int y=0;x<=items.size();y++){
                    if(x!=y && items.get(y).equals(items.get(x))){
                        //checks that not comparing same string, then compares strings, if equal returns false
                        return false;
                    }
                }
            }
        return true;
    }   
    
    public String toString() {     
        // EFFECTS: Returns a string that contains the strings in the     
        //          stack and the top element. Implements the       
        //          abstraction function. 
        // d) Write the code for the toString() here 
               
        for (String item : items) {
            System.out.println(item);
        }
        return("Top of string is :"+ items.get(items.size()-1));
        
        
    }
    
}
