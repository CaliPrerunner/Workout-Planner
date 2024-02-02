import java.util.LinkedList;

public class day {
    String date;
    String name;
    LinkedList <food> foodEatenToday;

    //methods
    public float gettotalCaoloriesEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
           food x = (food) foodEatenToday.get(q);
            total+= x.getCalories(); }
return total;
    }
    public float getTotalProtienEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getProtien(); }
        return total;
    }
    public float getTotalCarbsEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getCarbs(); }
        return total;
    }
    public float getTotalfatEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getFat(); }
        return total;
    }
    public float getTotalSugarsEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getTotalSugars(); }
        return total;
    }
    public float getTotalFiberEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getFiber(); }
        return total;
    }
    public float getTotalFransFatEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getTransFat(); }
        return total;
    }
    public float getTotalSodiumEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getSodium(); }
        return total;
    }
    public float getTotalAddedSugarsEaten(){
        float total = 0;
        for(int q=0; q <= (foodEatenToday.size()-1); q++ ){
            food x = (food) foodEatenToday.get(q);
            total += x.getAddedSugars(); }
        return total;
    }
   //need to make method for how mansy servines are eaten



    //constructor
    public day(String d, String n, LinkedList fet){
        this.date = d;
        this.name = n;
        this.foodEatenToday = fet;

    }
}
