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
