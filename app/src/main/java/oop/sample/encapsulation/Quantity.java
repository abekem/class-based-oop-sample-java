package oop.sample.encapsulation;

class Quantity {
    static final int MIN = 1;
    static final int MAX = 100;

    int value;

    Quantity(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException("不正：" + MIN + "未満");
        }
        if (value > MAX) {
            throw new IllegalArgumentException("不正：" + MAX + "超");
        }
        this.value = value;
    }

    boolean canAdd(Quantity other) {
        int added = addValue(other);
        return added <= MAX;
    }

    Quantity add(Quantity other) {
        if (!canAdd(other)) {
            throw new IllegalArgumentException("不正：合計が" + MAX + "超");
        }
        int added = addValue(other);
        return new Quantity(added);
    }

    private int addValue(Quantity other) {
        return this.value + other.value;
    }

    boolean isDiscountable() {
        return this.value >= 10;
    }
}
