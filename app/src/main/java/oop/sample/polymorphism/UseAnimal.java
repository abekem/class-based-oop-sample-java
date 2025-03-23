package oop.sample.polymorphism;

class UseAnimal {
    void useAnimal() {
        Human kentaro = new Human();
        kentaro.eat(); // メロンパンを食べます

        Dog john = new Dog();
        john.eat();    // ジャーキーを食べます
    }

    void useAnimal2() {
        Animal kentaro = new Human();
        kentaro.eat(); // メロンパンを食べます

        Animal john = new Dog();
        john.eat();    // ジャーキーを食べます
    }
    
    void useAnimal3() {
        Dog john = new Dog();
        john.bark();  // 🙆犬クラスから犬クラスの吠えるメソッドは呼び出せる
        
        Animal pochi = new Dog();
        // pochi.bark(); 🙅動物クラスから犬クラスの吠えるメソッドは呼び出せない
    }

    void eat(String type) {
        if (type.equals("Human")) {
            System.out.println("メロンパンを食べます");
        } else if (type.equals("Dog")) {
            System.out.println("ジャーキーを食べます");
        }
    }

    void eat(Animal animal) {
        animal.eat();
    }

    void eat(Human human) {
        human.eat();
    }

    void eat(Dog dog) {
        dog.eat();
    }
}
