abstract class Compartment{
  public abstract String notice();
}
class FirstClass extends Compartment{
  public String notice(){
  return "First Class Compartment";
}
}
class Ladies extends Compartment {
  public String notice(){
  return "Ladies Compartment";
}
}
class General extends Compartment {
  public String notice(){
  return "General Compartment";
}
}
class Luggage extends Compartment {
  public String notice(){
  return "Luggage Compartment";
}
}
public class Main{
  public static void main(String[] args){
    Compartment[] compartments = new Compartment[10];
    for(int i =0;i<10;i++){
      int random = (int)(Math.random() * 4) +1;
      if(random ==1){
        compartments[i] = new FirstClass();
      }
      else if (random == 2){
        compartments[i] = new Ladies();
      }
      else if (random == 3){
        compartments[i] = new General();
      }
      else {
        compartments[i] = new Luggage();
      }
    }
    for(int i=0;i<10;i++){
      System.out.println("Compartment" + (i+1) + ": " + compartments[i].notice());
    }
  }
}
        

