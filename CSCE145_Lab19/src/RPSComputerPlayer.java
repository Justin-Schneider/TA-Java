import java.util.Random;

public class RPSComputerPlayer extends RPSPlayer{

	private Random rand;
	
	public RPSComputerPlayer()
	{
		super();
		this.rand = new Random();
	}
	
	public void chooseGesture() {
		int r = rand.nextInt(3);
		if(r == 0) super.setGesture("rock");
		else if (r == 1) super.setGesture("paper");
		else if (r == 2) super.setGesture("scissors");
	}
	
}
