import java.util.ArrayList;
import java.util.List;

public class CoinSet {

    private List<Integer> coinSets = new ArrayList<>();

    public void add(int coin) {
        coinSets.add(coin);
    }

    @Override
    public boolean equals(Object coinSet) {
        if (!(coinSet instanceof CoinSet)) {
            return false;
        }

        return this.toString().equals(coinSet.toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Integer coin : coinSets) {
            builder.append(coin);
        }
        return builder.toString();
    }
}
