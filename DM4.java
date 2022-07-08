import java.util.Random;
public class DM4 {
	public static void main(String[] args) {
		Random r = new Random();
		int ram;
		int cntH = 0, cntT = 0;

		System.out.println("Tossing a coin ...");
		for(int i = 1; i <= 3; i ++) {
			ram = r.nextInt(2);
			switch (ram) {
			case 0:
				cntH ++;
				System.out.println("Round "+i+": Heads");
			break;

			case 1:
				cntT ++;
				System.out.println("Round "+i+": Tails");
			break;
			}
		}
		System.out.println("Heads: "+cntH+", Tails: "+cntT);
	}

}
