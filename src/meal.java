import java.time.LocalDate;
import java.util.LinkedList;

public class meal {
    //VARIABLES
    LocalDate date;
    String time;
    // maybe time object for calculating puropses.
    //thinking about chaging these to string or keeping them as date & time type variables depending on how i use them to calculate

    LinkedList <food> foodEatenMeal;
    //not sure if it more efficent
    float protienSum;
    float totalCarbohydratesSum;
    float fatSum;
    float caloriesSum;
    float totalsugarsSum;
    float fiberSum;
    float transfatSum; //verb bad
    float sodiumSum; //typically mg
    float addedSugarsSum;

    float servingSizeSum;
    float servingsConsumedSum;


    //METHODS
    public float getProtien(){return protienSum;}
    public float getCarbs(){return totalCarbohydratesSum;}
    public float getFat(){return fatSum;}
    public float getCalories(){return caloriesSum;}
    public float getTotalSugars(){return totalsugarsSum;}
    public float getFiber(){return fiberSum;}
    public float getTransFat(){return transfatSum;}
    public float getSodium(){return sodiumSum;}
    public float getAddedSugars(){return addedSugarsSum;}
    public float getServingSize(){return servingSizeSum;}
    public float getServingsConsumed(){return servingsConsumedSum;}


//need to decide how to add al the macros of the food and save them in the constructor
    //idea: add them all in the constructor

}
