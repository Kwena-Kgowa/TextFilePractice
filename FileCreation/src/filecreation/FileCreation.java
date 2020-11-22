/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreation;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Kwena Martin
 */
public class FileCreation {
    
    public static void main(String[] args) {
        File fileObj = new File("index.html");
        try
        {
            if(!fileObj.exists())
                fileObj.createNewFile();
            PrintWriter pw = new PrintWriter(fileObj);
            pw.println("<h1>Hello world</h1>");
            pw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
