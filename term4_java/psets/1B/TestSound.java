public class TestSound {
  public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Cat(), new Cow(), new SiberianCat()};
    System.out.println(AnimalConcert.performConcert(animals));
  }
}
