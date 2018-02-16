public class ChangeModule {
    enum Coin {
        KRW500(500), KRW100(100), KRW50(50), KRW10(10);
        private int value;

        private Coin(int value) {
            this.value = value;
        }
    }

    public CoinSet getChangeCoinSet(int change) {
        CoinSet coinSet = new CoinSet();
        int remainChange = change;
        for (Coin coin : Coin.values()) {
            remainChange = addCoinsToCoinSet(remainChange, coinSet, coin.value);
        }

        return coinSet;
    }

    private int addCoinsToCoinSet(int change, CoinSet coinSet, int coinValue) {
        while (change >= coinValue) {
            change -= coinValue;
            coinSet.add(coinValue);
        }
        return change;
    }
}
