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
      case RedBird: 
        result += 100;
      case YellowBird: 
        result += 100;
      case BlueBird: 
        result += 100;
      case BlackBird: 
        result += 100;
      case WhiteBird: 
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

