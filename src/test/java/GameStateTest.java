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
    l.add(ABObject.create(ABType.WhiteBird));
    GameState gs = new GameState(l);
    assertEquals(100, gs.getNumPoints());
  } 
  public void testBird() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.yellowBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBird() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.redBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBird() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.blackBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBird() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.blueBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBird() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.pig));
	    GameState gs = new GameState(l);
	    assertEquals(1000, gs.getNumPoints());
	  }  

}
