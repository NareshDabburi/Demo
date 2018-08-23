package com.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Utility {

	public static void function(String sourceFilesDir,String destFilesDir) {
		try {
		//String sourceFilesDir = "C:\\Users\\Sumati Saumya\\Downloads\\Demo\\source";
       // String destFilesDir = "C:\\Users\\Sumati Saumya\\Downloads\\Demo\\destination";
        File[] sourceFiles = new File(sourceFilesDir).listFiles();
        FileWriter fw=new FileWriter("C:\\Users\\Sumati Saumya\\Downloads\\Demo\\paths\\path.txt");
        String newLine = System.getProperty("line.separator");
       
        for (File source : sourceFiles) {
            if (source.getAbsolutePath().endsWith(".pdf") || (source.getAbsolutePath().endsWith(".ps")||(source.getAbsolutePath().endsWith(".afp")))) {
            	 File dest = new File(destFilesDir+"\\"+source.getName());
            	 if(dest.exists()) {
            	System.out.println(source.getName());
            	String str=source.getAbsolutePath();
            	int index1=str.indexOf('.');
            	String extension=str.substring(index1+1);
            	fw.append(extension+"Compare"+"   "+source.getName()+"           "+dest.getName() +newLine);
            	
            	//fw.append('\n');
            	}
            }
	}
        fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
 }
}

