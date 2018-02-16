import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeModuleTest {
    @Test
    public void 거스름돈_모듈_50원() {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(50);
        assertEquals("700원 투입 후 650원 음료 선택", expectedCoinSet, module.getChangeCoinSet(50));
    }

    @Test
    public void 거스름돈_180원() {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        assertEquals("700원 투입 후 520원 음료 선택", expectedCoinSet, module.getChangeCoinSet(180));
    }
}
