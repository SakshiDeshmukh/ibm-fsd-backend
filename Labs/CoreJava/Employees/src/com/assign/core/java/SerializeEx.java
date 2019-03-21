package com.assign.core.java;

import java.io.FileOutputStream;
import java.io.IOException;                    
import java.io.ObjectOutputStream;

public class SerializeEx implements java.io.Serializable{
	private static final long serialVersionUID = -8461634285752007920L;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Sakshi Deshmukh";
		e.address = "Sangamner,Maharashtra";
		e.SSN = 1112233344;
		e.id = 1001;

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\SakshiKDeshmukh\\Desktop\\Documents\\JAVA\\InputByteStream.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:\\\\Users\\\\SakshiKDeshmukh\\\\Desktop\\\\Documents\\\\JAVA\\\\InputByteStream.txt ");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}
