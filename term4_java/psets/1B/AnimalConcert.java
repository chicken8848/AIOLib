public class AnimalConcert {
  public static String performConcert(Animal[] arr) {
    String output = "";
    for (int i = 0; i < arr.length - 1; i++) {
      output = output + arr[i].makeSound() + ", ";
    }
    return output + arr[arr.length - 1].makeSound();
  }
}
