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
  public void getAge(int args) {
    this.age = args;
  }
  public String getName() {
    if (this.getsharingConsent()) {
    return this.name;
    }
    else {
      return "Anonymous"
    }
  }
  public boolean getsharingConsent() {
    return sharingConsent;
  }
}
