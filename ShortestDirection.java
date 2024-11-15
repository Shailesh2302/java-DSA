public class ShortestDirection {

  public static float getShortestPath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      if (dir == 'S') {
        x--;
      } else if (dir == 'E') {
        x++;
      } else if (dir == 'N') {
        y++;
      } else {
        y--;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    String path = "WNEENESSWNESENNN";
    System.out.println(getShortestPath(path));
  }
}
