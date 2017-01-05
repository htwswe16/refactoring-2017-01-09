// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.awt.Rectangle;

public class GameStateTest extends TestCase {

  public void testEmpty() {
    GameState gs = new GameState(new ArrayList<ABObject>());
    assertEquals(0, gs.getNumPoints());
  }  

  public void testBird() {
    ArrayList l = new ArrayList<ABObject>();
    l.add(new ABObject(new Rectangle(0,0,100,100), ABType.WhiteBird));
    GameState gs = new GameState(l);
    assertEquals(100, gs.getNumPoints());
  }  

}
