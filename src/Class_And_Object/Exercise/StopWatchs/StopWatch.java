package Class_And_Object.Exercise.StopWatchs;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){

    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public long getStartTime() {
        return this.startTime;
    }
    public void startTime(){
        long now = System.currentTimeMillis();
        setStartTime(now);
    }
    public void endTime(){
        long now = System.currentTimeMillis();
        setEndTime(now);
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
