package oop.sample.polymorphism;

// class Human extends Animal {
//     @Override
//     void eat() {
//         System.out.println("メロンパンを食べます");
//     }

//     // 省略
// }

class Human extends Animal {
    @Override
    void eat() {
        System.out.println("メロンパンを食べます");
    }

    void grab() {
        // ...
    }

    void speak() {
        // ...
    }
}
