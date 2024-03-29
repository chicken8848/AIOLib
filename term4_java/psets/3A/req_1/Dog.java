public class Dog extends Animal {

  public Dog(String name) {
    super("Dog:" + name);
  }

  @Override
  public String makeSound() {
    return this.toString() + " says " + "Woof";
  }
}
