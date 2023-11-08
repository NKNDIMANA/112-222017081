interface Pol {
  void getA();

  // default method 
  default void getS() {
    System.out.println("I can get sides of a pol.");
  }
}

// implements the interface
class Rect implements Pol {
  public void getA() {
    int l = 6;
    int b = 5;
    int a = l * b;
    System.out.println("The ar of the rect is " + a);
  }

  // overrides the getS()
  public void getS() {
    System.out.println("I have 4 s.");
  }
}

// implements the interface
class ER implements Pol {
  public void getA() {
    int l = 5;
    int a = l * l;
    System.out.println("The a of the s is " + a);
  }
}

class Gry {
  public static void main(String[] args) {

    // create an object of Rect
    Rect r1 = new Rect();
    r1.getA();
    r1.getS();

    // create an object of Square
    ER s1 = new ER();
    s1.getA();
    
    
  }
}