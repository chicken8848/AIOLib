import java.util.*;

public class OctagonComparator implements Comparator<Octagon> {
  @Override
  public int compare(Octagon o1, Octagon o2) {
    return Double.compare(o1.getSide(), o2.getSide());
  }
}
