package jrout.tutorial.garbageCollection;

import jrout.tutorial.constructor.Piano;

public class GarbageCollectionExample {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 1000000000; i++){
			Piano p = new Piano("Yamaha"+ i);
		}
	}
}