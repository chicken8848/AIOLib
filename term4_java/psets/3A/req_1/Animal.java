import java.util.Objects;

public abstract class Animal {

  private String name;

  Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String makeSound();

  // override toString(), equals() and hashCode()
  @Override
  public String toString() {
    return getName();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Animal animal = (Animal) o;
    return Objects.equals(name, animal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
