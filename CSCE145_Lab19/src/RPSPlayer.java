
public class RPSPlayer implements RPSPlayerInterface{

	private String gesture;
	private int points;
	
	public RPSPlayer() {
		this.gesture = "none";
		this.points = 0;
	}

	public RPSPlayer(String gesture, int points) {
		this.gesture = gesture;
		this.points = points;
	}

	public String getGesture() {
		return gesture;
	}

	public int getPoints() {
		return points;
	}

	public void setGesture(String gesture) {
		if(gesture.equalsIgnoreCase("rock") || gesture.equalsIgnoreCase("paper") || gesture.equalsIgnoreCase("scissors")) this.gesture = gesture;
		else 
		{ 
			System.out.println("Not a valid gesture"); 
			this.gesture = "none";
		}
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void chooseGesture() {
		this.gesture = "none";
	}
	
}
