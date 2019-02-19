package shape;

import math.Ray;
import math.Transformation;
import math.Vector;

public class AxisAlignedBox  implements Shape {
	
	/**
	 * The transformation which is applied to the box to place it in the
	 * scene.
	 */
	public final Transformation transformation;
	
	/**
	 * Creates a new Box at the origin that is aligned with the axis, transformed by the given
	 * transformation.
	 * 
	 * @param transformation
	 *            the transformation applied to this box.
	 * @throws NullPointerException
	 *             when the transformation is null.
	 */
	public AxisAlignedBox(Transformation transformation) throws NullPointerException {
		
		if (transformation == null)
			throw new NullPointerException("the given transformation is null!");
		this.transformation = transformation;
	}

	@Override
	public boolean intersect(Ray ray) {
		
		if (ray == null)
			return false;
		Ray transformed = transformation.transformInverse(ray);	
		
		return false;
	}
	
	
}
