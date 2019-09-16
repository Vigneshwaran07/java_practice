import java.util.*;
public class robo 
{
  public static void main(String[] args)
  {
    int x =3, y =4, increment = 0;
    String pos = "2-2-E", move = "R M L M L M R M", result = "", final_dir = "";
    
    String movement[] = move.split(" ");
    String initial[] = pos.split("-");
    
    int robo_x = Integer.parseInt(initial[0]), robo_y = Integer.parseInt(initial[1]);
    
    HashMap<String, Integer> dir = new HashMap<>();
    dir.put("N", 0);
    dir.put("E", 90);
    dir.put("S", 180);
    dir.put("W", 270);
    dir.put("NE", 45);
    dir.put("SE", 135);
    dir.put("SW", 225);
    dir.put("NW", 315);
    
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
      else if(i.equals("l"))
      {
        degree -= 45;
      }
      else if(i.equals("r"))
      {
        degree += 45;
      }
      if(degree < 0)
      {
        degree = 360 + degree;
      }
      
      if(i.equals("M") || i.equals("m"))
      {
        if(i.equals("M"))
          {
            increment = 2;
          }
        else if(i.equals("m"))
          {
            increment = 1;
          }
          switch(degree)
          {
            case 0:   robo_y += increment; break;
            case 45:  robo_x += increment; robo_y += increment; break;
            case 90:  robo_x += increment; break;
            case 135: robo_x += increment; robo_y -= increment; break;
            case 180: robo_y -= increment; break;
            case 225: robo_x -= increment; robo_y -= increment; break;
            case 270: robo_x -= increment; break;
            case 315: robo_x -= increment; robo_y += increment; break;
          }
          if((robo_x > x || robo_y > y) || (robo_x < 0 || robo_y < 0))
          {
            switch(degree)
            {
              case 0:   robo_y -= increment; break;
              case 45:  robo_x -= increment; robo_y -= increment; break;
              case 90:  robo_x -= increment; break;
              case 135: robo_x -= increment; robo_y += increment; break;
              case 180: robo_y += increment; break;
              case 225: robo_x += increment; robo_y += increment; break;
              case 270: robo_x += increment; break;
              case 315: robo_x += increment; robo_y -= increment; break;
            }
            border_exceed_flag = 1;
            break;
          }
      }
      degree = degree%360;
    }
    for(String k : dir.keySet())
    {
      if(dir.get(k) == degree)
      {
        final_degree = k;
        break;
      }
    }
    if(border_exceed_flag == 1)
    {
        result = robo_x+"-"+robo_y+"-"+final_degree+"-ER";
    }
    else
    {
        result = robo_x+"-"+robo_y+"-"+final_degree;
    }
    System.out.println(result);
  }
  
}
