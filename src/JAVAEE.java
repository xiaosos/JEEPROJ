import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JAVAEE {
    private static JAVAEE ourInstance = new JAVAEE();

    public static JAVAEE getInstance() {
        return ourInstance;
    }

    private JAVAEE() {
    }

    public void getCal(){

        Calendar calendar = Calendar.getInstance();

        int c = calendar.getMinimalDaysInFirstWeek();
        System.out.println(c);

        calendar.set(1988,11,26);
        Date date = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:年:-MM-dd");
        String datestr = simpleDateFormat.format(date);

        System.out.println(datestr);
    }

    public static void main(String[] args){
        JAVAEE jee = new JAVAEE();
        jee.getCal();

        J2 j2 = new J2();
        j2.getC();
        j2.getTest("age");
        j2.getDate(new Date());
    }
}
