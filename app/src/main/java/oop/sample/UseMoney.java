package oop.sample;

import java.math.BigDecimal;

public class UseMoney {
    public void useMoney() {

        // Money money = new Money(1000, "JPY");

        // BigDecimal tax = money.tax();

        // int unitPrice = 100;
        // int quantity = 10;
        // int amount = amount(quantity, unitPrice);

        // Money unitPrice = new Money(100, "JPY");
        // Quantity quantity = new Quantity(10);
        // Money amount = amount(unitPrice, quantity);
    }
    
    void goodMoneyUsage() {
        Money basePrice = new Money(3000, "JPY");
        Money discounted = basePrice.minus(1000); // minus()メソッドは別のMoneyオブジェクトを作成して返す(後述)
        Money option = new Money(1000, "JPY");    // 新しくMoneyオブジェクトを作る
    }

    void badMoneyUsage() {
        // Money price = new Money(3000, "JPY");

        // useMoney(price); // 金額を使用する

        // price.setValue(2000);
        // price = new Money(1000, "JPY");

        // useMoney(price); // 金額を使用する

        Money price = new Money(3000, "JPY");

        price.setValue(2000);           // ✕ 値を書き換えている
        price = new Money(1000, "JPY"); // ✕ 1つの変数に別の値を代入している
    }

    void useMoney(Money price) {

    }

    int discountCriteria = 10;

    int discountAmount(int unitPrice, int quantity) {
        return unitPrice * quantity * 9 / 10;
    }

    int amount(int unitPrice, int quantity) {
        if (quantity >= discountCriteria) {
            return discountAmount(unitPrice, quantity);
        }
        return unitPrice * quantity;
    }

    // Money discountAmount(Money unitPrice, Quantity quantity) {
    // return unitPrice.multiply(quantity);
    // }

    // Money amount(Money unitPrice, Quantity quantity) {
    // if (quantity.isDiscountable()) {
    // return discountAmount(unitPrice, quantity);
    // }
    // return unitPrice.multiply(quantity);
    // }
}
