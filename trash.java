import java.util.*;
import java.lang.*;
class HelloCodiva {
  
  public static void main(String[] args)
  {
    int x =3, y =3;
    String pos = "2-2-E", move = "R M L M L M";
    
    String movement[] = move.split(" ");
    
    int robo_x = Character.getNumericValue(pos.charAt(0)), robo_y = Character.getNumericValue(pos.charAt(2));
    char direction = pos.charAt(4);
    
    int border_exceed_flag = 0;
    for(String i:movement)
    {
      if(Math.abs(robo_x) > x || Math.abs(robo_y) > y)
      {
        border_exceed_flag = 1;
        break;
      }
    }
    
  }
  
}

