package org.eclipse.gmf.internal.codegen.draw2d;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;


/**
 * <code>GridLayoutData</code> is the layout data object associated with
 * <code>GridLayout</code>. To set a <code>GridLayoutData</code> object into a
 * <code>Figure</code>, you use the <code>setConstraint()</code> method of
 * <code>GridLayout</code> to map the <code>Figure</code> to its layout
 * <code>GridLayoutData</code>.
 * <p>
 * There are two ways to create a <code>GridLayoutData</code> object with certain
 * fields set. The first is to set the fields directly, like this:
 * 
 * <pre>
 * GridLayoutData gridData = new GridLayoutData();
 * gridData.horizontalAlignment = GridLayoutData.FILL;
 * gridData.grabExcessHorizontalSpace = true;
 * 
 * // associate the figure to the GridLayoutData object
 * myGridlayout.setConstraint(myFigure, gridData);
 * </pre>
 * 
 * The second is to take advantage of convenience style bits defined by
 * <code>GridLayoutData</code>:
 * 
 * <pre>
 * GridLayoutData gridData = new GridLayoutData(GridLayoutData.HORIZONTAL_ALIGN_FILL | GridLayoutData.GRAB_HORIZONTAL);
 * </pre>
 * 
 * </p>
 * <p>
 * NOTE: Do not reuse <code>GridLayoutData</code> objects. Every child in the parent
 * <code>Figure</code> that is managed by the <code>GridLayout</code> must
 * have a unique <code>GridLayoutData</code> object. If the layout data for a Grid
 * member in a <code>GridLayout</code> is null at layout time, a unique
 * <code>GridLayoutData</code> object is created for it.
 * </p>
 * 
 * [GMF]: NOTE: The set of the ALIGNMENT constants is changed in this class
 * comparing to original version to match the set of constants in the generated
 * code. E.g, <code>GridLayoutData.BEGINNING = SWT.BEGINNING - 1</code>.
 * Thus, this implementation is NOT intended to use SWT.* constants for
 * alignment.
 * 
 * @see GridLayout
 */
public final class GridLayoutData {
    /**
	 * verticalAlignment specifies how figures will be positioned vertically
	 * within a cell.
	 * 
	 * The default value is CENTER.
	 * 
	 * Possible values are:
	 * 
	 * <code>GridLayoutData.BEGINNING = SWT.BEGINNING - 1</code> (or
	 * <code>SWT.TOP - 1</code>): Position the figure at the top of the cell
	 * 
	 * <code>GridLayoutData.CENTER = SWT.CENTER - 1</code>: Position the
	 * figure in the vertical center of the cell
	 * 
	 * <code>GridLayoutData.END = SWT.END - 1</code> (or
	 * <code>SWT.BOTTOM - 1</code>): Position the figure at the bottom of the
	 * cell
	 * 
	 * <code>GridLayoutData.FILL = SWT.FILL - 1</code>: Resize the figure to
	 * fill the cell vertically
	 */
    public int verticalAlignment = CENTER;
    
    /**
	 * horizontalAlignment specifies how figures will be positioned horizontally
	 * within a cell.
	 * 
	 * The default value is BEGINNING.
	 * 
	 * Possible values are:
	 * 
	 * <code>GridLayoutData.BEGINNING = SWT.BEGINNING - 1</code> (or
	 * <code>SWT.TOP - 1</code>): Position the figure at the left of the cell
	 * 
	 * <code>GridLayoutData.CENTER = SWT.CENTER - 1</code>: Position the
	 * figure in the horizontal center of the cell
	 * 
	 * <code>GridLayoutData.END = SWT.END - 1</code> (or
	 * <code>SWT.BOTTOM - 1</code>): Position the figure at the right of the
	 * cell
	 * 
	 * <code>GridLayoutData.FILL = SWT.FILL - 1</code>: : Resize the figure
	 * to fill the cell horizontally
	 */
    public int horizontalAlignment = BEGINNING;
    
    /**
     * widthHint specifies a minimum width for the column. A value of 
     * SWT.DEFAULT indicates that no minimum width is specified.
     *
     * The default value is SWT.DEFAULT.
     */
    public int widthHint = SWT.DEFAULT;
    
    /**
     * heightHint specifies a minimum height for the row. A value of
     * SWT.DEFAULT indicates that no minimum height is specified.
     *
     * The default value is SWT.DEFAULT.
     */
    public int heightHint = SWT.DEFAULT;
    
    /**
     * horizontalIndent specifies the number of pixels of indentation
     * that will be placed along the left side of the cell.
     *
     * The default value is 0.
     */
    public int horizontalIndent = 0;
    
    /**
     * horizontalSpan specifies the number of column cells that the figure
     * will take up.
     *
     * The default value is 1.
     */
    public int horizontalSpan = 1;
    
    /**
     * verticalSpan specifies the number of row cells that the figure
     * will take up.
     *
     * The default value is 1.
     */
    public int verticalSpan = 1;
    
    /**
     * grabExcessHorizontalSpace specifies whether the cell will be made
     * wide enough to fit the remaining horizontal space.
     *
     * The default value is false.
     */ 
    public boolean grabExcessHorizontalSpace = false;
    
    /**
     * grabExcessVerticalSpace specifies whether the cell will be made
     * tall enough to fit the remaining vertical space.
     *
     * The default value is false.
     */ 
    public boolean grabExcessVerticalSpace = false;

    /**
     * Value for horizontalAlignment or verticalAlignment.
     * Position the figure at the top or left of the cell.
     */
    public static final int BEGINNING = 0; //SWT.BEGINNING - 1;
    
    /**
     * Value for horizontalAlignment or verticalAlignment.
     * Position the figure in the vertical or horizontal center of the cell
     */
    public static final int CENTER = 1;
    
    /**
     * Value for horizontalAlignment or verticalAlignment.
     * Position the figure at the bottom or right of the cell
     */
    public static final int END = 2;
    
    /**
     * Value for horizontalAlignment or verticalAlignment.
     * Resize the figure to fill the cell horizontally or vertically.
     */
    public static final int FILL = 3; //SWT.FILL - 1;

    /**
     * Style bit for <code>new GridLayoutData(int)</code>.
     * Position the figure at the top of the cell.
     * Not recommended. Use 
     * <code>new GridLayoutData(int, GridLayoutData.BEGINNING, boolean, boolean)</code>
     * instead.
     */
    public static final int VERTICAL_ALIGN_BEGINNING =  1 << 1;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to position the 
     * figure in the vertical center of the cell.
     * Not recommended. Use
     * <code>new GridLayoutData(int, GridLayoutData.CENTER, boolean, boolean)</code>
     * instead.
     */
    public static final int VERTICAL_ALIGN_CENTER = 1 << 2;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to position the 
     * figure at the bottom of the cell.
     * Not recommended. Use
     * <code>new GridLayoutData(int, GridLayoutData.END, boolean, boolean)</code>
     * instead.
     */
    public static final int VERTICAL_ALIGN_END = 1 << 3;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fill the cell vertically.
     * Not recommended. Use
     * <code>new GridLayoutData(int, GridLayoutData.FILL, boolean, boolean)</code>
     * instead
     */
    public static final int VERTICAL_ALIGN_FILL = 1 << 4;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to position the 
     * figure at the left of the cell.
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.BEGINNING, int, boolean, boolean)</code>
     * instead.
     */
    public static final int HORIZONTAL_ALIGN_BEGINNING =  1 << 5;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to position the 
     * figure in the horizontal center of the cell.
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.CENTER, int, boolean, boolean)</code>
     * instead.
     */
    public static final int HORIZONTAL_ALIGN_CENTER = 1 << 6;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to position the 
     * figure at the right of the cell.
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.END, int, boolean, boolean)</code>
     * instead.
     */
    public static final int HORIZONTAL_ALIGN_END = 1 << 7;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fill the cell horizontally.
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.FILL, int, boolean, boolean)</code>
     * instead.
     */
    public static final int HORIZONTAL_ALIGN_FILL = 1 << 8;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fit the remaining horizontal space.
     * Not recommended. Use
     * <code>new GridLayoutData(int, int, true, boolean)</code>
     * instead.
     */
    public static final int GRAB_HORIZONTAL = 1 << 9;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fit the remaining vertical space.
     * Not recommended. Use
     * <code>new GridLayoutData(int, int, boolean, true)</code>
     * instead.
     */
    public static final int GRAB_VERTICAL = 1 << 10;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fill the cell vertically and to fit the remaining
     * vertical space.
     * FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL
     * Not recommended. Use
     * <code>new GridLayoutData(int, GridLayoutData.FILL, boolean, true)</code>
     * instead.
     */ 
    public static final int FILL_VERTICAL = VERTICAL_ALIGN_FILL | GRAB_VERTICAL;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fill the cell horizontally and to fit the remaining
     * horizontal space.
     * FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.FILL, int, true, boolean)</code>
     * instead.
     */ 
    public static final int FILL_HORIZONTAL = HORIZONTAL_ALIGN_FILL | GRAB_HORIZONTAL;
    
    /**
     * Style bit for <code>new GridLayoutData(int)</code> to resize the 
     * figure to fill the cell horizontally and vertically and 
     * to fit the remaining horizontal and vertical space.
     * FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL
     * Not recommended. Use
     * <code>new GridLayoutData(GridLayoutData.FILL, GridLayoutData.FILL, true, true)</code>
     * instead.
     */ 
    public static final int FILL_BOTH = FILL_VERTICAL | FILL_HORIZONTAL;

    int cacheWidth = -1, cacheHeight = -1;
    int [][] cache = new int[2][4];
    int cacheIndex = -1;

/**
 * Constructs a new instance of GridLayoutData using
 * default values.
 */
public GridLayoutData () {
    super ();
}

/**
 * Constructs a new instance based on the GridLayoutData style.
 * This constructor is not recommended.
 * 
 * @param style the GridLayoutData style
 */
public GridLayoutData (int style) {
    super ();
    if ((style & VERTICAL_ALIGN_BEGINNING) != 0) verticalAlignment = BEGINNING;
    if ((style & VERTICAL_ALIGN_CENTER) != 0) verticalAlignment = CENTER;
    if ((style & VERTICAL_ALIGN_FILL) != 0) verticalAlignment = FILL;
    if ((style & VERTICAL_ALIGN_END) != 0) verticalAlignment = END;
    if ((style & HORIZONTAL_ALIGN_BEGINNING) != 0) horizontalAlignment = BEGINNING;
    if ((style & HORIZONTAL_ALIGN_CENTER) != 0) horizontalAlignment = CENTER;
    if ((style & HORIZONTAL_ALIGN_FILL) != 0) horizontalAlignment = FILL;
    if ((style & HORIZONTAL_ALIGN_END) != 0) horizontalAlignment = END;
    grabExcessHorizontalSpace = (style & GRAB_HORIZONTAL) != 0;
    grabExcessVerticalSpace = (style & GRAB_VERTICAL) != 0;
}

/**
 * Constructs a new instance of GridLayoutData according to the parameters.
 * 
 * @param horizontalAlignment how figure will be positioned horizontally within a cell
 * @param verticalAlignment how figure will be positioned vertically within a cell
 * @param grabExcessHorizontalSpace whether cell will be made wide enough to fit the remaining horizontal space
 * @param grabExcessVerticalSpace whether cell will be made high enough to fit the remaining vertical space
 * 
 */
public GridLayoutData (int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace) {
    this (horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace, grabExcessVerticalSpace, 1, 1);
}

/**
 * Constructs a new instance of GridLayoutData according to the parameters.
 *  
 * @param horizontalAlignment how figure will be positioned horizontally within a cell
 * @param verticalAlignment how figure will be positioned vertically within a cell
 * @param grabExcessHorizontalSpace whether cell will be made wide enough to fit the remaining horizontal space
 * @param grabExcessVerticalSpace whether cell will be made high enough to fit the remaining vertical space
 * @param horizontalSpan the number of column cells that the figure will take up
 * @param verticalSpan the number of row cells that the figure will take up
 * 
 */
public GridLayoutData (int horizontalAlignment, int verticalAlignment, boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace, int horizontalSpan, int verticalSpan) {
    super ();
    this.horizontalAlignment = horizontalAlignment;
    this.verticalAlignment = verticalAlignment;
    this.grabExcessHorizontalSpace = grabExcessHorizontalSpace;
    this.grabExcessVerticalSpace = grabExcessVerticalSpace;
    this.horizontalSpan = horizontalSpan;
    this.verticalSpan = verticalSpan;
}

/**
 * Constructs a new instance of GridLayoutData according to the parameters.
 * A value of SWT.DEFAULT indicates that no minimum width or
 * no minumum height is specified.
 * 
 * @param width a minimum width for the column
 * @param height a minimum height for the row
 * 
 */
public GridLayoutData (int width, int height) {
    super ();
    this.widthHint = width;
    this.heightHint = height;
}

Dimension computeSize (IFigure figure, boolean flushCache) {
    if (cacheWidth != -1 && cacheHeight != -1) {
        return new Dimension (cacheWidth, cacheHeight);
    }
    for (int i = 0; i < cacheIndex + 1; i++) {
        if (cache [i][0] == widthHint && cache [i][1] == heightHint) {
            cacheWidth = cache [i][2];
            cacheHeight = cache [i][3];
            return new Dimension (cacheWidth, cacheHeight);
        }
    }

    Dimension size = figure.getPreferredSize(widthHint,heightHint);
    if (widthHint!=-1) size.width = widthHint;
    if (heightHint!=-1) size.height = heightHint;    

    if (cacheIndex < cache.length - 1) cacheIndex++;
    cache [cacheIndex][0] = widthHint;
    cache [cacheIndex][1] = heightHint;
    cacheWidth = cache [cacheIndex][2] = size.width;
    cacheHeight = cache [cacheIndex][3] = size.height;
    return size;
}


void flushCache () {
    cacheWidth = cacheHeight = -1;
    cacheIndex = -1;
}

String getName () {
    String string = getClass ().getName ();
    int index = string.lastIndexOf ('.');
    if (index == -1) return string;
    return string.substring (index + 1, string.length ());
}

public String toString () {

    String hAlign = "";
    switch (horizontalAlignment) {
        case FILL: hAlign = "GridLayoutData.FILL"; break;
        case BEGINNING: hAlign = "GridLayoutData.BEGINNING"; break;
        case END: hAlign = "GridLayoutData.LEFT"; break;
        case CENTER: hAlign = "GridLayoutData.CENTER"; break;
        default: hAlign = "Undefined "+horizontalAlignment; break;
    }
    String vAlign = "";
    switch (verticalAlignment) {
        case FILL: vAlign = "GridLayoutData.FILL"; break;
        case BEGINNING: vAlign = "GridLayoutData.BEGINNING"; break;
        case END: vAlign = "GridLayoutData.END"; break;
        case CENTER: vAlign = "GridLayoutData.CENTER"; break;
        default: vAlign = "Undefined "+verticalAlignment; break;
    }
    String string = getName()+" {";
    string += "horizontalAlignment="+hAlign+" ";
    if (horizontalIndent != 0) string += "horizontalIndent="+horizontalIndent+" ";
    if (horizontalSpan != 1) string += "horizontalSpan="+horizontalSpan+" ";
    if (grabExcessHorizontalSpace) string += "grabExcessHorizontalSpace="+grabExcessHorizontalSpace+" ";
    if (widthHint != SWT.DEFAULT) string += "widthHint="+widthHint+" ";
    string += "verticalAlignment="+vAlign+" ";
    if (verticalSpan != 1) string += "verticalSpan="+verticalSpan+" ";
    if (grabExcessVerticalSpace) string += "grabExcessVerticalSpace="+grabExcessVerticalSpace+" ";
    if (heightHint != SWT.DEFAULT) string += "heightHint="+heightHint+" ";
    string = string.trim();
    string += "}";
    return string;

}

}
