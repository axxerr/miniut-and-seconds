public class MMinuts_and_Seconds {
    public static void main(String[]args){
       System.out.println( getDurationString(154,50));
        System.out.println(getDurationString(70));
    }
    public static String getDurationString(int min,int sec) {
        int hour = 0;
        if (min < 0 || sec > 59 || sec <= 0) {
           return"invaid parametar";

        } else {
            hour = min / 60;
            int remaining_minutes = min % 60;
            return hour + "h" + remaining_minutes + "min" + sec + "sec";
        }

            }
            public static String getDurationString(int sec){
                if (sec<=0){
                    return "invalid parameter";
                }else{
                   int min=sec/60;
                    int remainingSeconds=sec%60;
                    return min + "min" + remainingSeconds + "sec";
        }
    }

    }

