package DesignPatterns.StructuralPattern.Composite.FileSystem;

import java.util.List;
import java.util.ArrayList;

public class Directory implements FileSystem {
	List<FileSystem> files;
	String name;
	
	Directory(String name){
		files = new ArrayList<>();
		this.name = name;
	}
	
	public void add(FileSystem file) {
		files.add(file);
	}
	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("Content of Directory " + name);
		for(FileSystem file : files) {
			file.ls();
		}
	}

}
