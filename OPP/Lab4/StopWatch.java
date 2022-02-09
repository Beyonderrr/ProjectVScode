public class StopWatch {
    private long startTime;
    private long endTime;

    //public stopwatch(){
    //}
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
