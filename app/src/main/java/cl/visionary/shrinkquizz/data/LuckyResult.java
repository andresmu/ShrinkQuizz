package cl.visionary.shrinkquizz.data;

/**
 * Created by Andrés on 18-04-2017.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean happy) {
        super(happy);
    }

    public String result(){
        return processingHappy() + processingDay();
    }

    private String processingHappy(){
        if (isHappy()){
            return "Qué bueno mantente positivo ";
        } else{
            return "Animate fuerza perro ";
        }
    }

    private String processingDay(){
        if (isLuckyDay()){
            return "Es tu dia de suerte";
        } else{
            return "Vendrán dias mejores";
        }
    }
}
