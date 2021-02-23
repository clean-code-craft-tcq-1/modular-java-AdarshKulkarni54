package colorcoder;

public final class ColorUtils
{
  private ColorUtils()
  {
    // this class need not to be instantiated as this is a utility class
  }
  private static final int NUMBER_OF_MAJOR_COLORS = MajorColor.values().length;

  private static final int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;

  static ColorPair getColorFromPairNumber(final int pairNumber)
  {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = (MajorColor) fromIndex(zeroBasedPairNumber / NUMBER_OF_MAJOR_COLORS, MajorColor.values());
    MinorColor minorColor = (MinorColor) fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS, MinorColor.values());
    return new ColorPair(majorColor, minorColor);
  }

  static int getPairNumberFromColor(final MajorColor major, final MinorColor minor)
  {
    return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
  }

  static Object fromIndex(final int index, final Object[] colorValues)
  {
    int colorIndex = 0;
    for (Object color : colorValues)
    {
      if (color instanceof MajorColor)
      {
        colorIndex = ((MajorColor) color).getIndex();
      }
      else if (color instanceof MinorColor)
      {
        colorIndex = ((MinorColor) color).getIndex();
      }
      if (colorIndex == index)
      {
        return color;
      }
    }
    return null;
  }
}
