package behavioral.command;

public class Main {
  public static void main(String[] args) {
    Tv livingRoomTv = new Tv();
    Command tvOn = new TvOnCommand(livingRoomTv);
    Command tvOff = new TvOffCommand(livingRoomTv);

    Remote remote = new Remote();
    //Setting turn on command to switch on TV
    remote.setCommand(tvOn);
    remote.pressButton();


    //Setting turn off command to switch off TV.
    remote.setCommand(tvOff);
    remote.pressButton();
  }
}