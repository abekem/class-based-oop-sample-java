package oop.sample.polymorphism;

// class Dog extends Animal {
//     @Override
//     void eat() {
//         System.out.println("ジャーキーを食べます");
//     }

//     // 省略
// }

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("ジャーキーを食べます");
    }

    void bark() {
        // ...
    }

    void run() {
        // ...
    }
}
