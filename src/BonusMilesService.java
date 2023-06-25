public class BonusMilesService {

    public int calculate(int price) {
        int costOfOneMile = 20;
        int numMilesForTicket = price / costOfOneMile;
        return numMilesForTicket;

    }
}


