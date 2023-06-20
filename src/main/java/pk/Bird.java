package pk;

public class Dog extends  Animal{

    @Override
    public void makeSound() {
        System.out.println("wwwuf");
    }

    @Override
    public void move() {
        System.out.println("dog wak");
    }
}
