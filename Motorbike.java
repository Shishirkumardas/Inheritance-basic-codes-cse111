public class Motorbike implements Bike{
  int speed=0;
  
  
  public void speedUp(int increment)
  {
    speed=speed+increment;
     }
  public void applyBrakes(int decrement){
  speed=speed-decrement;
  }
  public void printStatus(){
  System.out.println("Speed:"+speed);
  }
}
