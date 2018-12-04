package base;

import java.util.Random;

public class Dado {
	private Random r = new Random();
	
	public int jogarDado() {
		return r.nextInt(6 - 1) + 1;
	}
	
}
