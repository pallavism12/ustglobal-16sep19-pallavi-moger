package com.ustglobal.javaexrecise.exception;

import java.io.File;
import java.io.IOException;

public class FileTest12 {
	void open() throws ClassNotFoundException, IOException {
		File f=new File("a.txt");
		f.createNewFile();
		Class.forName("com.a");
		}

}
