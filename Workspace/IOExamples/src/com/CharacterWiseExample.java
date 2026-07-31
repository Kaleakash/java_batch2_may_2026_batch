package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterWiseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				FileReader fr = new FileReader("D:\\Maven Plugins.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("info.docx");
				BufferedWriter bw = new BufferedWriter(fw);
				){
			String data="";
			while((data =br.readLine())!=null ){
				bw.write(data);
			}
			
		}catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("file copied");
	}

}
