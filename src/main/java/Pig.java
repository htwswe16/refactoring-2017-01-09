// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
import java.awt.Rectangle;

public class Pig extends ABObject {
  public Pig(Rectangle mbr, ABType type) {
    super(mbr, type);
  }
  
  public int getPoints() {
	    return 1000;
	  }
}
