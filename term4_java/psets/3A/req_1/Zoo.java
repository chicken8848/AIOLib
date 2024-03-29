import java.util.*;

public class Zoo {

  private AnimalFactory animalFactory;
  private List<Animal> animalList;

  Zoo(AnimalFactory animalFactory) {
    // TODO Complete the constructor
    this.animalFactory = animalFactory;
    this.animalList = new ArrayList<>();
  }

  public void addAnimal(String type, String name) {
    // TODO Complete this method
    Animal ani = this.animalFactory.createAnimal(type, name);
    if (ani != null) {
      animalList.add(ani);
    }
  }

  public String performConcert() {
    // TODO Complete this method
    if (this.animalList.size() > 0) {
      String out = this.animalList.get(0).makeSound();
      for (int i = 1; i < this.animalList.size(); i++) {
        out = String.join("*", out, this.animalList.get(i).makeSound());
      }
      return out;
    }
    return "";
  }

  @Override
  public String toString() {
    // TODO Complete this method
    return this.animalList.toString();
  }
}
