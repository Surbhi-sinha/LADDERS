package Rating800;
import java.util.*;
import java.time.*;
import java.text.*;
public class leetcodecontest {
      public static void main(String[] args) throws ParseException {
            String arriveAlice = "10-01";
            String leaveAlice = "10-31";
            String arriveBob= "11-01";
            String leaveBob = "12-31";
            System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
      }
      public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) throws ParseException {
            
            SimpleDateFormat sdformat = new SimpleDateFormat("MM-DD");
            Date arrivealice = sdformat.parse(arriveAlice);
            Date arrivebob = sdformat.parse(arriveBob);
            Date leavesalice = sdformat.parse(leaveAlice);
            Date leavebob = sdformat.parse(leaveBob);

            Date latearrive ;
            if(arrivealice.compareTo(arrivebob)>0){
                  latearrive = arrivebob;
            }else{
                  latearrive = arrivealice;
            }

            Date earlyleaves ;
            if(leavesalice.compareTo(leavebob)>0){
                  earlyleaves = leavesalice;
            }else{
                  earlyleaves = leavebob;
            }

            long difference = earlyleaves.getTime() - latearrive.getTime();
	       int daysBetween = (int)(difference / (1000*60*60*24));
             return daysBetween;
      }
}
