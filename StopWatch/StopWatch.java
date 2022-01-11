package StopWatch;

import java.util.Date;

public class StopWatch {
	private long startTime,endTime;

	public StopWatch() {
		super();
		this.startTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }


	
	

}
