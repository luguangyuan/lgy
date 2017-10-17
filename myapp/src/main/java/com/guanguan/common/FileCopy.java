package com.guanguan.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static Boolean copy(String filePathAndName,String fileName){
		
		File file = new File(filePathAndName);
		if(!file.exists()){
			return false;
		}
		
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(new File(file.getPath())+fileName+file.getName().substring(fileName.lastIndexOf(".")+1));
			byte[] bt = new byte[1024];
			while(true){
				int ins = fis.read(bt);
				if(ins==-1){
					fis.close();
					fos.flush();
					fos.close();
					return false;
				}else{
					fos.write(bt, 0, ins);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
	}
	
}
