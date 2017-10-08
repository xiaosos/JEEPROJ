import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J2 {
    public void getC(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("类2:yyyy:-MM-dd");
        Date date = calendar.getTime();
        String datstr = simpleDateFormat.format(date);
        System.out.println(datstr);
    }

    public  void getTest(String age123 ){

    }

    public void getDate(Date date){

    }
}
