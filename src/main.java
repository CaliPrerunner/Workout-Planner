
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class main {

    public static void main(String[] args){


        //need to add a mechanims to make sure service size is greater than or equal to 0



food peach = new food("peach", 100, 100, 100 ,100 ,100 ,100, 100, 100, 100, 100, 100,1);
LinkedList test = new LinkedList<food>();
test.add(peach);
day thurs = new day("thurs", "h", test);
food t = (food) test.get(0);
System.out.println("this is "+t.getCalories());

System.out.println("total calories: "+thurs.gettotalCaoloriesEaten());
        food apple = new food("peach", 100, 100, 100 ,10 ,100 ,100, 100, 100, 100, 100, 100,1);
        test.add(apple);
        System.out.println("total calories again: "+thurs.gettotalCaoloriesEaten());


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
