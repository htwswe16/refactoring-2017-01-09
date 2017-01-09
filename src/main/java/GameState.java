// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
import java.util.List;

public class GameState {
  private List<ABObject> objects;

  GameState(List<ABObject> obj) {
    objects = obj;
  }

  int getNumPoints() {
    int result = 0;
    for(ABObject o : objects) {
      switch(o.getType()) {
      case Pig:
    	  break;
        result += 1000;
      case RedBird: 
    	  break;
        result += 100;
      case YellowBird: 
    	  break;
        result += 100;
      case BlueBird: 
    	  break;
        result += 100;
      case BlackBird: 
    	  break;
        result += 100;
      case WhiteBird: 
    	  break;
        result += 100;      
      case Ground:
      case Hill:
      case Sling:
      case Unknown:
    	  break;
      }
    }
  
    return result;
  }
}

