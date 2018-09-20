package com.zpkj.project8;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream inputStream  =  new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("G:"+File.separator+"test.txt")));
		
		while((c = inputStream.read()) >=0){
			System.out.print((char)c);
		}
		inputStream.close();
	}
	

}
