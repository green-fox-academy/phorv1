package MarkerAnnotation;

@Monitor
public class Screen {

  final String aspectRatio;
  String classification;
  Size size;


  public Screen(Size size) {
    this.size = size;
    this.aspectRatio = this.getClass().getAnnotation(Monitor.class).aspectratio();
    this.classification = this.getClass().getAnnotation(Monitor.class).classification();
  }

  @Override
  public String toString() {
    return String.format("Screen size: %d Resolution: %s Classification: %s", size.getInt(), aspectRatio, classification);
  }
}
