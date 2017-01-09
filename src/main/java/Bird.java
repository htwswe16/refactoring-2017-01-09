// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
import java.awt.Rectangle;

public class Bird extends ABObject {
  public Bird(Rectangle mbr, ABType type) {
    super(mbr, type);
  }
  
  @Override 
  public int getPoints() {
    return 100;
  }
}
