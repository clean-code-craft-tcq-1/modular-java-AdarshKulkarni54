package colorcoder;

enum MinorColor
{
  BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);

  private int index;

  private MinorColor(final int index)
  {
    this.index = index;
  }

  int getIndex()
  {
    return this.index;
  }
}