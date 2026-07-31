package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		FileOutputStream fos =new FileOutputStream("emp.txt");
//		
//		DataOutputStream dos = new DataOutputStream(fos);
//		int id=100;
//		String name = "Ravi";
//		float salary = 120000;
//		boolean result = true;
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(result);
//		System.out.println("primitive data stored");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id = dis.readInt();
		String name = dis.readUTF();
		float salary = dis.readFloat();
		boolean result = dis.readBoolean();
		System.out.println(id+" "+name+" "+salary+" "+result);
	}

}
