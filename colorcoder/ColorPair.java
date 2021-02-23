package colorcoder;

class ColorPair
{
  private MajorColor majorColor;
  private MinorColor minorColor;

  public ColorPair(final MajorColor major, final MinorColor minor)
  {
    this.majorColor = major;
    this.minorColor = minor;
  }

  public MajorColor getMajorColor()
  {
    return this.majorColor;
  }

  public MinorColor getMinorColor()
  {
    return this.minorColor;
  }
  @Override
  public String toString()
  {
    getMajorColor();
    String colorPairStr = ((MajorColor) ColorUtils.fromIndex(getMajorColor().getIndex(), MajorColor.values())).name();
    colorPairStr += " " + ((MinorColor) ColorUtils.fromIndex(getMinorColor().getIndex(), MinorColor.values())).name();
    return colorPairStr;
  }
}