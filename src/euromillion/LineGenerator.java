/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euromillion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dexter
 */
public class LineGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> line = new ArrayList<Integer>();
        List<Integer> bonus = new ArrayList<Integer>();
        
       
        
        while (line.size() < 5){
            BigDecimal bdRandomNum = new BigDecimal(Math.random() * 50);
            int iRandomNum = Integer.parseInt(bdRandomNum.setScale(0, RoundingMode.UP).toString());
        
            if (line.isEmpty()){
                line.add(iRandomNum);
            } else {
                // Now check if the number has been added already
                if (line.indexOf(iRandomNum) ==  -1){
                    line.add(iRandomNum);
                }
            }            
        }
        
        Collections.sort(line);
        
        System.out.println("Line numbers " + line.toString());
    }
    
}
