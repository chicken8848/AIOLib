public class MarkTest {
  public static void main(String[] args) {
    Mark marky = new Mark();
    Mark.Bar barry = new Mark.Bar();
    barry.w = 5;
    marky.m();
    Mark.Foo foo = marky.new Foo();
    foo.f();
  }
}

class Mark {
  int z;

  Mark() {
    z = 1;
  }

  void m() {
    System.out.println(new Foo().y);
  }

  class Foo {
    int y;
    int u;
    Mark marky = new Mark();

    Foo() {
      y = 2;
      u = 2;
    }

    void f() {
      System.out.println(y);
    }
  }

  static class Bar {
    int x;
    static int w;

    Bar() {
      x = 1;
      w = 1;
    }
  }
}
