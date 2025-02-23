package oop.sample;

public class NestedIf {
    public static void nestedIf() {
        String currency1 = "JPY";
        String currency2 = "USD";
        int amount1 = 100;
        int amount2 = 200;
        int MAX = 10000;
        int MIN = 0;
        String calcType = "add";
        String ADD = "add";

        // 金額の通貨が同じ場合
        if (currency1.equals(currency2)) {
            // 加算の場合
            if (calcType.equals(ADD)) {
                // 計算結果が最大値を超えない場合
                if (amount1 + amount2 <= MAX) {
                    // 金額を加算
                    amount1 += amount2;
                }
            } else {
                // 減算の場合
                // 計算結果が最小値未満にならない場合
                if (amount1 - amount2 >= MIN) {
                    // 金額を減算
                    amount1 -= amount2;
                }
            }
        }
    }
}
