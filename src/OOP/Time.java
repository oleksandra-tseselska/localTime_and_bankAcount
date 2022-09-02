package OOP;

import java.time.LocalTime;

public class Time {
    private int ZEROTIME = 0;
    private int MAXSECMIN = 60;
    private int MAXHOUR = 24;
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int seconds){
        if(seconds < 0 || seconds > MAXSECMIN){
            System.out.println("You have to put seconds from 0 to 60");
            return;
        }

        this.hour = ZEROTIME;
        this.minutes = ZEROTIME;
        this.seconds = seconds;
    }

    public Time(int minutes, int seconds){
        if(seconds < 0 || minutes < 0 || seconds > MAXSECMIN || minutes > MAXSECMIN){
            System.out.println("You have to put seconds and minutes from 0 to 60");
            return;
        }

        this.hour = ZEROTIME;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hour, int minutes, int seconds){
        if(seconds < 0 || minutes < 0 || hour < 0 || hour > MAXHOUR || seconds > MAXSECMIN || minutes > MAXSECMIN){
            System.out.println("You have to put seconds and minutes from 0 to 60 and hours from 0 to 24");
            return;
        }
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setSeconds(int seconds){
        if(errorInput(this.seconds, seconds, MAXSECMIN)) {return;};

        this.seconds += seconds;
    }

    public void setMinutes(int minutes){
        if(errorInput(this.minutes, minutes, MAXSECMIN)) {return;};

        this.minutes += minutes;
    }

    public void setHour(int hour) {
        if(errorInput(this.hour, hour, MAXHOUR)) {return;};

        this.hour += hour;
    }

    public void getTime(){
        if(this.hour < 10 || this.minutes < 10 || this.seconds < 10){
            String hour = fixInvalidTime(this.hour);
            String minutes = fixInvalidTime(this.minutes);
            String seconds = fixInvalidTime(this.seconds);

            System.out.println(hour+":"+minutes+":"+seconds);
            return;
        }

        System.out.println(Integer.toString(this.hour)+":"+Integer.toString(this.minutes)+":"+Integer.toString(this.seconds));
    }

    private String fixInvalidTime(int time){
        String timeStr;

        if (time < 10){
            timeStr = "0"+Integer.toString(time);
        } else{
            timeStr = Integer.toString(time);
        }

        return timeStr;
    }

    private boolean errorInput(int availableTime, int inputTime, int maxValidTime) {
        boolean result = false;

        if (inputTime < 0 || (inputTime + availableTime) > maxValidTime) {
            int permissibleInput = maxValidTime - availableTime;

            System.out.println("You have to put number from 0 to " + permissibleInput);
            result = true;
        }

        return result;
    }
}
