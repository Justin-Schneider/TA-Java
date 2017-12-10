
public class Clock24 {

	private int hours;
	private int minutes;
	private boolean isAM;
	
	public Clock24() {
		this.hours = 0;
		this.minutes = 0;
		this.isAM = true;
	}
	
	public Clock24(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public boolean isAM() {
		return isAM;
	}

	public void setHours(int hours) throws TimeFormatException {
		if( 0 <= hours && hours <= 24) this.hours = hours;
		else throw new TimeFormatException("Hours can't be negative or greater than 24");
	}

	public void setMinutes(int minutes) throws TimeFormatException {
		if( 0 <= minutes && minutes <= 60) this.minutes = minutes;
		else throw new TimeFormatException("Minutes can't be negative or greater than 60");
	}

	public void setAM(boolean isAM) {
		this.isAM = isAM;
	}

	public void setTime(int h, int m) throws TimeFormatException
	{
		if( (24 >= h && h >= 0)  && (60 >= m  && m >= 0))
		{
			if(h > 12)
			{
				this.setHours(h - 12);
				this.setMinutes(m);
				this.setAM(false);
			}
			else {
				this.setHours(h);
				this.setMinutes(m);
				this.setAM(true);
			}
		}
	}
	
	public void setTime(String s) throws TimeFormatException
	{
		try {
			int index = s.indexOf(":");
			this.setHours(Integer.parseInt(s.substring(0, index)));
			this.setMinutes(Integer.parseInt(s.substring(index + 1)));
		}
		catch (Exception e)
		{
			throw new TimeFormatException();
		}
		
		if( (24 >= this.getHours() && this.getHours() >= 0)  && (60 >= this.getMinutes()  && this.getMinutes() >= 0))
			{
				if(this.getHours() > 12)
				{
					this.setHours(this.getHours() - 12);
					this.setMinutes(this.getMinutes());
					this.setAM(false);
				}
				else {
					this.setHours(this.getHours());
					this.setMinutes(this.getMinutes());
					this.setAM(true);
				}
			}
	}
	
	public void printTime()
	{
		String s = "PM";
		if(this.isAM()) s = "AM";
		System.out.println(this.getHours() + ":" + this.getMinutes() + " " + s);
	}
	
}
