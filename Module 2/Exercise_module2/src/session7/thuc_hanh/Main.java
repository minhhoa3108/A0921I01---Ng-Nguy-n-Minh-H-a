package session7.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        /** Kiểm thử Animal
         * **/
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler1 = (Chicken) animal;
                System.out.println(edibler1.howToEat());
            }
        }
    }
}
