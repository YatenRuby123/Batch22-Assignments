package jrout.tutorial.constructor;

public class PianoClientThisExample {

	public static void main(String[] args) {
		
		Piano yamaha = new Piano("Yamaha");
		System.out.println(yamaha.brand);
		
	Piano musicPiano = new Piano("Yamaha","Yellow","TBX",3);
	musicPiano.printDetails("Jayaram");
	
		Piano ybx = new Piano("Hello","YBX");
		System.out.println(ybx.name);
				
		
	}
}
