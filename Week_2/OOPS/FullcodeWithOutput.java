package music;
public interface Playable{
  void play();
}
class Veena implements Playable{
  public void play(){
    System.out.println("Playing Veena");
 }
}
class Saxophone implements Playable{
  public void play(){
    System.out.println("Playing Saxophone");
  }
}
public class Main{
public static void main(String[] args){
  Veena v = new Veena();
  Saxophone s = new Saxophone();
  v.play();
  s.play();
  Playable p;
  p=v;
  p.play();
  p=s;
  p.play();
 }
}
