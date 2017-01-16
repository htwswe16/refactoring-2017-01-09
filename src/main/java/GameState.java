// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
import java.util.List;

public class GameState {
  private List<VisualObject> objects;

  GameState(List<VisualObject> obj) {
    objects = obj;
  }

  int getNumPoints() {
    int result = 0;
    for(VisualObject o : objects) {
        result += o.getPoints();
    }
    return result;
  }
}

