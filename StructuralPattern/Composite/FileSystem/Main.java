package StructuralPattern.Composite.FileSystem;

public class Main {

	public static void main(String[] args) {
		Directory directory = new Directory("Main");
		directory.add(new File("First file"));
		directory.add(new File("Second file"));
		Directory sub1 = new Directory("Book Directory");
		sub1.add(new File("Book 1"));
		sub1.add(new File("Book 2"));
		directory.add(sub1);
		Directory sub2 = new Directory("Movie Directory");
		sub2.add(new File("Movie 1"));
		sub2.add(new File("Movie 2"));
		Directory music = new Directory("Music");
		music.add(new File("Music 1"));
		music.add(new File("Music 2"));
		sub2.add(music);
		directory.add(sub2);
		directory.ls();
	}

}
