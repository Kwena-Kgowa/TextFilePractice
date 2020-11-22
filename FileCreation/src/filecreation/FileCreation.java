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
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MethodsClass methods = new MethodsClass("index.html");
        System.out.println("Enter your string");
        String input = scan.nextLine();
        methods.Write(input);
        System.out.println("Input was successful");
    }//end of main
    
}
