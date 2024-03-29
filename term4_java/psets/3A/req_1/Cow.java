public class Cow extends Animal {
  public Cow(String name) {
    super("Cow:" + name);
  }

  @Override
  public String makeSound() {
    return this.toString() + " says Moo Moo";
  }
}
