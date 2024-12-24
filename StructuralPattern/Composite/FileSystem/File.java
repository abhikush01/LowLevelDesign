package StructuralPattern.Composite.FileSystem;

public class File implements FileSystem {
	String content;
	File(String content){
		super();
		this.content = content;
	}
	@Override
	public void ls() {
		System.out.println(content);
	}

}
