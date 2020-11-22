/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreation;
import java.util.Scanner;
/**
 *
 * @author Kwena Martin
 */
public class FileCreation {
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        MethodsClass methods = new MethodsClass("index.txt");
        MethodsClass method = new MethodsClass();
        
        methods.AdvancedWrite("Kwena");
        
    }//end of main3
    
}
