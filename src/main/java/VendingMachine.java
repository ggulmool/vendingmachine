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
}
