import java.util.LinkedList;

public class day {
    String date;
    String name;
    LinkedList <food> foodEatenToday;

    //methods
    public float totalCaoloriesEaten(){

        float totalCalories = 0;
        for(int q=0; q > (foodEatenToday.size()-1); q++ ){
           food x = (food) foodEatenToday.get(q);
           float cp = x.getCalories();
           totalCalories += cp;
            //float x =+ foodEatenToday.get(q).getCalories();

        }

return totalCalories;
    }

    //constructor
    public day(String d, String n, LinkedList fet){
        this.date = d;
        this.name = n;
        this.foodEatenToday = fet;

    }
}
