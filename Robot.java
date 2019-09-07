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
    int x =3, y =4;
    String pos = "2-2-E", move = "R M L M L M R M", result = "";
    
    String movement[] = move.split(" ");
    String initial[] = pos.split("-");
    
    int robo_x = Integer.parseInt(initial[0]), robo_y = Integer.parseInt(initial[1]);
    
    HashMap<String, Integer> dir = new HashMap<>();
    dir.put("N", 0);
    dir.put("E", 90);
    dir.put("S", 180);
    dir.put("W", 270);
    
    int border_exceed_flag = 0, degree = dir.get(initial[2]);
    
    for(String i:movement)
    {
      if(i.equals("L"))
      {
        degree -= 90;
      }
      else if(i.equals("R"))
      {
        degree += 90;
      }
      if(degree < 0)
      {
        degree = 360 + degree;
      }
      if(i.equals("M"))
      {
        switch(degree)
        {
          case 0:   robo_y += 1; break;
          case 90:  robo_x += 1; break;
          case 180: robo_y -= 1; break;
          case 270: robo_x -= 1; break;
        }
      }
        if((robo_x > x || robo_y > y) || (robo_x < 0 || robo_y < 0))
        {
          switch(degree)
            {
              case 0:   robo_y -= 1; break;
              case 90:  robo_x -= 1; break;
              case 180: robo_y += 1; break;
              case 270: robo_x += 1; break;
            }
          border_exceed_flag = 1;
          break;
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
