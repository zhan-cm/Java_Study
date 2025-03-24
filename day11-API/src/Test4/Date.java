package Test4;

public class Date {
    private long time;

    public Date() {
        this.time=System.currentTimeMillis();
    }

    public Date(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
