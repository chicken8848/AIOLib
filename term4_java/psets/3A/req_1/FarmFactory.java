// TODO Complete this

public class FarmFactory implements AnimalFactory {
  @Override
  public Animal createAnimal(String type, String name) {
    switch (type) {
      case "Cat":
        return new Cat(name);
      case "Dog":
        return new Dog(name);
      case "Cow":
        return new Cow(name);
      default:
        return null;
    }
  }
}
