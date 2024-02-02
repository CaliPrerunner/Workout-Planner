public class food {

    //vaar's
    String name;
    float protien;
    float totalCarbohydrates;
    float fat;
    float calories;
    int barCode;
    float totalsugars;
    float fiber;
    float transfat; //verb bad
    float sodium; //typically mg
    float addedSugars;
    float servingSize; //in grams want to sandardize it to 100mg when comparing
    // add a variable for ingredents later bc it might need to be an array or some sort of linked data structure

    //methods
    public float getProtien(){return protien;}
    public float getTotalCarbs(){return totalCarbohydrates;}
    public float getFat(){return fat;}
        public float getCalories(){return calories;}
    public int getBarCode(){return barCode;}
    public float getTotalSugars(){return totalsugars;}
    public float getFiber(){return fiber;}
    public float getTransFat(){return transfat;}
    public float getSodium(){return sodium;}
    public float getAddedSugars(){return addedSugars;}
    public float getServingSize(){return servingSize;}


    //constructor
    public food(String n,float p, float tc, float fat, float c, int bc, float ts, float fib, float tf, float sd, float as, float ss){

        if(ss != 100) {
                this.name = n;
                this.barCode = bc;


                float factor = (ss / 100);

                this.servingSize = ss / factor;
                this.protien = p * factor;
                this.totalCarbohydrates = factor * tc;
                this.fat = fat * factor;
                this.calories = factor * c;
                this.totalsugars = ts * factor;
                this.fiber = fib * factor;
                this.transfat = tf * factor;
                this.sodium = sd * factor;
                this.addedSugars = addedSugars * factor;

            } else if (ss == 100) {
                this.name = n;
                this.protien = p;
                this.totalCarbohydrates = tc;
                this.fat = fat;
                this.calories = c;
                this.barCode = bc;
                this.totalsugars = ts;
                this.fiber = fib;
                this.transfat = tf;
                this.sodium = sd;
                this.addedSugars = as;
                this.servingSize = ss;

        }

    }

}
