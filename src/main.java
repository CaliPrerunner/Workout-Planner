
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class main {

    public static void main(String[] args){


        //need to add a mechanims to make sure service size is greater than or equal to 0



food peach = new food("peach", 100, 100, 100 ,100 ,100 ,100, 100, 100, 100, 100, 100);
LinkedList test = new LinkedList<food>();
test.add(peach);
day thurs = new day("thurs", "h", test);

        float u = 0;
 u = thurs.totalCaoloriesEaten();
 System.out.println(u);

 //food class works

/*
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.now();
        String text = date.format(formatter);
        System.out.println(text);
        //String text = date.format(formatter);

*/

}

}
