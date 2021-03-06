// -*- mode: Java; indent-tabs-mode: nil; c-basic-offset: 2; -*-
/*****************************************************************************
 ** ANGRYBIRDS AI AGENT FRAMEWORK
 ** Copyright (c) 2014, XiaoYu (Gary) Ge, Stephen Gould, Jochen Renz
 **  Sahan Abeyasinghe,Jim Keys,  Andrew Wang, Peng Zhang
 ** All rights reserved.
 **This work is licensed under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 **To view a copy of this license, visit http://www.gnu.org/licenses/
 *****************************************************************************/
import java.awt.Point;
import java.awt.Rectangle;

public class ABObject extends Rectangle implements VisualObject {
  private static final long serialVersionUID = 1L;
  private static int counter = 0;
  public int id;
  //object type
  public ABType type;
 
  public int area = 0;
  //For all MBRs, the shape is Rect by default.
  public ABShape shape = ABShape.Rect;
 
  //For all MBRs, the angle is 0 by default.
  public double angle = 0;
 
  //is Hollow or not
  public boolean hollow = false;
 
 
  public ABObject(Rectangle mbr, ABType type) {
    super(mbr);
    this.type = type;
    this.id = counter++;
  }

  public ABObject(Rectangle mbr, ABType type, int id) {
    super(mbr);
    this.type = type;
    this.id = id;
  }

  public ABObject(ABObject ab) {
    super(ab.getBounds());
    this.type = ab.type;
    this.id = ab.id;
  }

  public ABObject() {
    this.id = counter ++;
    this.type = ABType.Unknown;
  }

  /* (non-Javadoc)
 * @see VisualObject#getType()
 */
@Override
public ABType getType() {
    return type;
  }

  /* (non-Javadoc)
 * @see VisualObject#getCenter()
 */
@Override
public Point getCenter() {
    return new Point((int)getCenterX(), (int)getCenterY());
  }

  /* (non-Javadoc)
 * @see VisualObject#getPoints()
 */
@Override
public int getPoints() {
    return 0;
  }

  public static void resetCounter() {
    counter = 0;	
  }

  public static VisualObject create(ABType type) {
	  switch(type) {
	  case YellowBird:
	  case RedBird:
	  case BlueBird:
	  case BlackBird:
	  case WhiteBird:
		  return new Bird(new Rectangle(0,0,100,100), type);
	  case Pig: 
		  return new Pig(new Rectangle(0,0,100,100), type);
	  default: 
		  return new ABObject(new Rectangle(0,0,100,100), type);
	  }
    
  }
}
