
package parser1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Parser1 {

    
    public static void main(String[] args) {
        //read a text file containing a python code
        //give a number for each lines as they are separate statements
        
        
        String file;
        Scanner scan = new Scanner(System.in);
        file = scan.nextLine();
        
        String line= null;
        int count = 0;
        int space = 0;
        int key = 0;
        
        Map<Integer, Object> path = new HashMap<>();
        
        List<Object> conditions = new ArrayList<>();
        try{
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            
            while((line = buffered.readLine()) != null){
                
            }
            
            
            buffered.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void addToCondtionsList(String line){
        
    }
    
}
