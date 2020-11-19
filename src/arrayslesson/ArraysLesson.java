/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslesson;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author stusi
 */
public class ArraysLesson {
    static String word; // Declares variable name (makes it global)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Assignment statement:
        // type variableName = value;
        int x = 2;
        double y = 1.5;
        boolean playing = true;
        word = "hello";
        char letter = 'A';
        doStuff(); // Call method to run it
        
        // Arrays are like lists but have a set length
        // and can only hold one type of data
        int[] arr1 = new int[5]; // Empty array of length 5
        arr1[0] = 4; // 4 is now the first number (index 0)
        int[] arr2 = {2,4,6}; // Can put values in right away 
        String[] words = {"hello","world"};
        
        // For 2D arrays, use double square brackets
        int[][] grid = {{1,2},
                        {3,4}};
        // First bracket is the row
        System.out.println(Arrays.toString(grid[0]));
        // Second bracket is column
        System.out.println(grid[0][1]);
        
        // ArrayLists are like python lists, then have variable
        // length and we can add, remove, insert, etc.
        // ArrayLists can only hold objects (not primitive data)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.get(0); // Returns the value at index 0
        numbers.size(); // Calculates the current size of the list
        
    }
    
    public static void doStuff(){
        System.out.println(word);
        
    }
    
    
}
