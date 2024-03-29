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
    StringBuilder concert = new StringBuilder();
    for (Animal animal : animalList) {
      concert.append(animal.makeSound()).append("*");
    }
    // TODO Complete this method
    return concert.toString();
  }

  @Override
  public String toString() {
    // TODO Complete this method
    return this.animalList.toString();
  }
}
