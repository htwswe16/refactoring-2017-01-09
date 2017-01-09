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
    	result += o.getPoints();
      }
  
    return result;
  }
}

