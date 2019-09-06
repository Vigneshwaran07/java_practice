package hydra;
import java.util.*;
public class robo {
  
  static String getDirection(int degree)
  {
    degree = degree%360; 
    String res = "-";
    switch(degree)
    {
      case 0: res = "N"; break;
      case 90: res = "E"; break;
      case 180: res = "S"; break;
      case 270: res = "W"; break;
    }
    return res;
  } 
  
  public static void main(String[] args)
  {
    int x =3, y =3;
    String pos = "2-2-E", move = "R M L M L M", result = "";
    
    String movement[] = move.split(" ");
    
    int robo_x = Character.getNumericValue(pos.charAt(0)), robo_y = Character.getNumericValue(pos.charAt(2));
    
    HashMap<String, Integer> dir = new HashMap<>();
    dir.put("N", 0);
    dir.put("E", 90);
    dir.put("S", 180);
    dir.put("W", 270);
    
    int border_exceed_flag = 0, degree = dir.get(pos.charAt(4)+"");
    
    for(String i:movement)
    {
      if(Math.abs(robo_x) > x || Math.abs(robo_y) > y)
      {
        border_exceed_flag = 1;
        break;
      }
      
      if(i.equals("L"))
      {
        degree -= 90;
      }
      else if(i.equals("R"))
      {
        degree += 90;
      }
      else if(i.equals("M"))
      {
        if(degree == 180)
        {
          robo_y -= 1;
        }
        else if(degree == 270)
        {
          robo_x -= 1;
        }
        else if(degree == 0)
        {
          robo_y += 1;
        }
        else if(degree == 90)
        {
          robo_x += 1;
        }
      }
      degree = degree%360;
    }
    if(border_exceed_flag == 1)
    {
    	result = robo_x+"-"+robo_y+"-"+getDirection(degree)+"-ER";
    }
    else
    {
    	result = robo_x+"-"+robo_y+"-"+getDirection(degree);
    }
    System.out.println(result);
  }
  
}
