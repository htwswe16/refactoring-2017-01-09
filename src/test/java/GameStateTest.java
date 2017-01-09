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

  public void testBirdwhite() {
    ArrayList l = new ArrayList<ABObject>();
    l.add(ABObject.create(ABType.WhiteBird));
    GameState gs = new GameState(l);
    assertEquals(100, gs.getNumPoints());
  } 
  public void testBirdyellow() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.YellowBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBirdred() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.RedBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBirdblack() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.BlackBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testBirdblue() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.BlueBird));
	    GameState gs = new GameState(l);
	    assertEquals(100, gs.getNumPoints());
	  }  
  public void testpig() {
	    ArrayList l = new ArrayList<ABObject>();
	    l.add(ABObject.create(ABType.Pig));
	    GameState gs = new GameState(l);
	    assertEquals(1000, gs.getNumPoints());
	  }  

}
