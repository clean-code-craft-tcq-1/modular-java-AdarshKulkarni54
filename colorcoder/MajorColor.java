package colorcoder;

enum MajorColor
{
  WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

  private int index;

  private MajorColor(final int index)
  {
    this.index = index;
  }

  int getIndex()
  {
    return this.index;
  }
}