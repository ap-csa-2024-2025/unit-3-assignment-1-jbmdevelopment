import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  
  {
    Rectangle rec1 = new Rectangle(5, 10);
    Rectangle rec2 = new Rectangle(2, 4);
    boolean isRotated = (rec1.getLength() == rec2.getWidth()) && (rec1.getWidth() == rec2.getLength());
    boolean isCongruent = (isRotated || rec1.equals(rec2));
    boolean isSimilar = isCongruent || ( (rec1.getLength() / rec2.getLength()) == (rec1.getWidth() / rec2.getWidth()));
    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);
  }
}
