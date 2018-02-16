public class VendingMachine {

    private int change;

    public void putCoin(int coin) {
        change += coin;
    }

    public int getChangeAmount() {
        return change;
    }

    public void selectDrink(Drink drink) {
        change -= drink.getPrice();
    }

    public CoinSet getChangeCoinSet() {
        CoinSet coinSet = new CoinSet();

        while (change >= 500) {
            change -= 500;
            coinSet.add(500);
        }

        while (change >= 100) {
            change -= 100;
            coinSet.add(100);
        }

        while (change >= 50) {
            change -= 50;
            coinSet.add(50);
        }

        while (change >= 10) {
            change -= 10;
            coinSet.add(10);
        }

        return coinSet;
    }
}
