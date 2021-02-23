package colorcoder;

public class Main
{
  static void testNumberToPair(final int pairNumber, final MajorColor expectedMajor, final MinorColor expectedMinor)
  {
    ColorPair colorPair = ColorUtils.getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + colorPair.toString());
    assert colorPair.getMajorColor() == expectedMajor;
    assert colorPair.getMinorColor() == expectedMinor;
  }

  static void testPairToNumber(final MajorColor major, final MinorColor minor, final int expectedPairNumber)
  {
    int pairNumber = ColorUtils.getPairNumberFromColor(major, minor);
    System.out.println("Got pair number " + pairNumber);
    assert pairNumber == expectedPairNumber;
  }

  public static void main(final String[] args)
  {
    testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

    testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
  }
}