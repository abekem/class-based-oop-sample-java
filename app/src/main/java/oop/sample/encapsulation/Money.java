package oop.sample.encapsulation;

import java.math.BigDecimal;

// class Money {
//     private int amount; // 金額
//     private String currency; // 通貨
//     private static final BigDecimal TAX_RATE = new BigDecimal("0.08"); // 税率

//     // 税額を計算する
//     public BigDecimal tax() {
//         return new BigDecimal(this.amount).multiply(TAX_RATE);
//     }
// }

// class Money {
//     private int value; // 金額

//     // 金額を加算する
//     public Money add(Money other) {
//         if (!this.currency.equals(other.currency)) {
//             // 通貨が異なる場合はエラー
//             throw new IllegalArgumentException("Currency mismatch.");
//         }
//         return new Money(this.amount + other.amount, this.currency);
//     }

//     public Money(int amount, String currency) {
//         this.amount = amount;
//         this.currency = currency;
//     }
// }

class Money {
    private int value; // 金額
    private String currency; // 通貨

    public void setValue(int newValue) {
        this.value = newValue;
    }
    
    public Money minus(int amount) {
        return new Money(this.value - amount, this.currency);
    }

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }
}

// class Money {
// private int amount; // 金額
// private String currency; // 通貨
// private static final BigDecimal TAX_RATE = new BigDecimal("0.08"); // 税率

// // 税額を計算する
// public BigDecimal tax() {
// return new BigDecimal(this.amount).multiply(TAX_RATE);
// }

// // 金額を加算する
// public Money add(Money other) {
// if (!this.currency.equals(other.currency)) {
// // 通貨が異なる場合はエラー
// throw new IllegalArgumentException("Currency mismatch.");
// }
// return new Money(this.amount + other.amount, this.currency);
// }

// public Money(int amount, String currency) {
// this.amount = amount;
// this.currency = currency;
// }

// boolean isDiscountable() {
// return this.amount >= 1000;
// }

// Money multiply(int quantity) {
// return new Money(this.amount * quantity, this.currency);
// }

// Money multiply(Quantity quantity) {
// return new Money(this.amount * quantity.value, this.currency);
// }
// }
