package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseExamples {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\images.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("output1.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read())!=-1) {
			bos.write(ch);
		}
		//bos.flush();
	
		fis.close();
		fos.close();
		System.out.println("image copied");
	}

}
