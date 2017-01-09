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
        result += 1000;
        break;
      case RedBird: 
        result += 100;
        break;
      case YellowBird: 
        result += 100;
        break;
      case BlueBird: 
        result += 100;
        break;
      case BlackBird: 
        result += 100;
        break;
      case WhiteBird: 
        result += 100;   
        break;
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

