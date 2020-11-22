/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreation;
import java.io.File;
import java.io.PrintWriter;
//import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MethodsClass 
{
    private static String _fileName;
    public MethodsClass(){};
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
    
    public void AdvancedWrite(String word)
    {
        BufferedReader br;
        File myFile = new File("index.txt");
        try
        {
            if(!myFile.exists())
                myFile.createNewFile();
            
            br = new BufferedReader(new FileReader(_fileName));
            String line;
            ArrayList<String> newLines = new ArrayList<String>(){};
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
                newLines.add(line);
            }
            for(String l : newLines)
                System.out.println(l);
            
        }catch(Exception e)
        {
            
        }
    }//end of AdvancedWrite()
    
    public boolean CheckFile(String fileName)
    {
        File fileObj = new File(fileName);
        if(!fileObj.exists())
            return false;
        else
            return true;
    }
    
    public String ReadFile()
    {
        BufferedReader br = null;
        int lineCounter = 0;
        try
        {
            br = new BufferedReader(new FileReader(_fileName));
            File myFile = new File(_fileName);
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
                ++lineCounter;
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return ""+ (lineCounter);
    }//end of the ReadFile method
    
}
