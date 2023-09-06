package interfaceprivatemethods;

public interface Schedule {

    private static void checkTime(int hour){
        if( hour >17 ){
            System.out.println("You are late!");
        }   else    {
            System.out.println("You have "+(17-hour)+" hours left to make the appoinment");
        }
    }
    default  void wakeUp(){
        checkTime(7);
    }
    private void haveBreakfast(){
        checkTime(9);
    }
    static void workOut(){
        checkTime(18);
    }
}
