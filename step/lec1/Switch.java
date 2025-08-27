import java.util.Scanner;

class Solution{
    public void whichDay(Scanner sc){
        int day = sc.nextInt();
        String dayName;
        switch(day){
            case 1:
                dayName = "Monday" ;
                break;
            case 2:
                dayName = "Tuesday" ;
                break;
            case 3:
                dayName = "Wednesday" ;
                break;
            case 4:
                dayName = "Thursday" ;
                break;
            case 5:
                dayName = "Friday" ;
                break;
            case 6:
                dayName = "Saturday" ;
                break;
            case 7:
                dayName = "Sunday" ;
                break;
            default:
                dayName = "Invalid day number" ;
        }
        System.out.println(dayName);
    }
}

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.whichDay(sc);
        s.whichDay(sc);
    }
}
