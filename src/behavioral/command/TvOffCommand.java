package behavioral.command;

public class TvOffCommand implements Command {
  private final Tv tv;

  public TvOffCommand(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.off();
  }
}