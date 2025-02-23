package oop.sample;

import java.math.BigDecimal;

public class UseMoney {
    public void useMoney() {
        Money money = new Money(1000, "JPY");

        BigDecimal tax = money.tax();

        // int unitPrice = 100;
        // int quantity = 10;
        // int amount = amount(quantity, unitPrice);

        Money unitPrice = new Money(100, "JPY");
        Quantity quantity = new Quantity(10);
        Money amount = amount(unitPrice, quantity);
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

    Money discountAmount(Money unitPrice, Quantity quantity) {
        return unitPrice.multiply(quantity);
    }

    Money amount(Money unitPrice, Quantity quantity) {
        if (quantity.isDiscountable()) {
            return discountAmount(unitPrice, quantity);
        }
        return unitPrice.multiply(quantity);
    }
}
