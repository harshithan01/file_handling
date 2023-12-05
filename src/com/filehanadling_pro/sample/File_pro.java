package com.filehanadling_pro.sample;

import java.io.File;
import java.io.IOException;

public class File_pro {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Sample.txt");
		f.createNewFile();
		System.out.println("file creted successfull");
	}
	

}
