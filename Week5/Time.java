package Week5;
class createTime{
    int hours, mins, secs;
    void setTime() {
        System.out.println("Initializing time to 0");
        this.hours = 0;
        this.mins = 0;
        this.secs = 0;
    }

    void setTime(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
        System.out.println("Setting time as: "+hours+":"+mins+":"+secs);
    }

    createTime addTime(createTime t1, createTime t2) {
        createTime result = new createTime();
        result.secs = t1.secs + t2.secs;
        result.mins = t1.mins + t2.mins + result.secs / 60;
        result.hours = t1.hours + t2.hours + result.mins / 60;
        result.secs %= 60;
        result.mins %= 60;
        result.hours %= 24;

        return result;
}}
public class Time {

    public static void main(String[] args) {
        createTime t1 = new createTime();
        createTime t2 = new createTime();
        t1.setTime();
        t1.setTime(23, 14, 31);
        t2.setTime();
        t2.setTime(22, 43, 18);
        createTime t3 = t1.addTime(t1,t2);
        System.out.println("The addition of the two times gives: "+t3.hours+":"+t3.mins+":"+t3.secs);

    }
}