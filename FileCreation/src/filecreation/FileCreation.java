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
        MethodsClass method = new MethodsClass();
        System.out.print("Please enter file name ");
        String name = scan.nextLine();
        System.out.println(method.CheckFile(name));
    }//end of main
    
}
