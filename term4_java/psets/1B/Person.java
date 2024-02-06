public class Person {
  String name;
  int age;
  char gender;
  boolean sharingConsent;

  Person(String na, int ag, char gen, boolean shar) {
    this.age = ag;
    this.name = na;
    this.gender = gen;
    this.sharingConsent = shar;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int value) {
    if (value > 0) {
      this.age = value;
    }
  }

  public String getName() {
    if (this.getSharingConsent()) {
      return this.name;
    } else {
      return "Anonymous";
    }
  }

  public boolean getSharingConsent() {
    return sharingConsent;
  }
}
