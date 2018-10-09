package clock;

public abstract class Clock {
	
	protected int deltaTime;
	
	public Clock(int deltaTime) {
		super();
		this.deltaTime = deltaTime;
	}

	public int getDeltaTime() {
		return deltaTime;
	}

	public void setDeltaTime(int deltaTime) {
		this.deltaTime = deltaTime;
	}

	public abstract void setLocalTime(int localTime);
}
