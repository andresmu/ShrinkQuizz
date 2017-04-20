package cl.visionary.shrinkquizz.data;

/**
 * Created by Andrés on 18-04-2017.
 */

public class MatchAnswer {
    private int ageUser, ageLover;

    public MatchAnswer(int ageUser, int ageLover) {
        this.ageUser = ageUser;
        this.ageLover = ageLover;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public int getAgeLover() {
        return ageLover;
    }
}
