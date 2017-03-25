public class Dice {
	private Coin c;
	public Dice() {
		c = new Coin();
	}
	public byte roll() {
		byte r = 0;
		byte e = 1;
		for (byte i = 0; i < 3; i++) {
			if (c.flip()) {
				r += e;
			}
			e *= 2;
		}
		return r;
	}
}
