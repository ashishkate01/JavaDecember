 class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barking");
        }
    }

    class Cat extends Animal {
        void meow() {
            System.out.println("Cat meowing");
        }
    }

    public class Test {
        public static void main(String[] args) {
            Animal a = new Dog();
            Animal b = new Cat();

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.bark();
            }

            Cat c = (Cat) b;
            c.meow();

        }
    }

