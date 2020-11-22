/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreation;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class MethodsClass 
{
    private static String _fileName;
    public MethodsClass(String fileName)
    {
        _fileName = fileName; 
    }

    public void Write(String input)
    {
        File fileObj = new File(_fileName);
        try
        {
            if(!fileObj.exists())
                fileObj.createNewFile();
            
            PrintWriter pw = new PrintWriter(fileObj);
            pw.println(input);
            pw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//end of the method

}
