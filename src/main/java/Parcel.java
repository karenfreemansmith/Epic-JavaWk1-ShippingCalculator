public class Parcel {
  public int volume(int height, int depth, int width) {
    int volume = height*width*depth;
    return volume;
  }

  public int cost(int weight, int distance) {
    int result = weight*distance*3/1000;
    return result;
  }
}
