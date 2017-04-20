package cl.visionary.shrinkquizz.data;

/**
 * Created by Andrés on 18-04-2017.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int ageUser, int ageLover) {
        super(ageUser, ageLover);
    }

    public String result(){
        return userFortune() + loverFortune();
    }

    private String userFortune(){
        if (getAgeUser() - getAgeLover() >0){
            return "Hay un desbalance negativo";
        } else {
            return "Hay un desbalance a tu favor";
        }
    }

    private String loverFortune(){
        int sum = getAgeUser() + getAgeLover();
        if (sum%2==0){
            return "Los planetas se alinean con su amor";
        } else{
            return "Las piramides contaran su historia";
        }
    }
}
