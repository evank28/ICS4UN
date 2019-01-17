public class PaintFloor {

	private static Robot r = new Robot() ;

	private static final int EMPTY = 0 ; // colours of a cell
	private static final int RED = 1 ;
	private static final int BLUE = 2 ;

	private static final int FORWARD = 0 ; //direction of motion
	private static final int BACKWARD = 2 ;

	private static final int FRONT = 0 ;
	private static final int RIGHT = 1 ; //direction
	private static final int BACK = 2 ;
	private static final int LEFT = 3 ;


	public static void main (String[] args )
	{
		paintFloor();

	}

	public static void paintFloor()
	{
		//marks the current cell as blue
		r.paint(BLUE);

		//paints region in front
		if (r.check(FRONT)==EMPTY)
		{
			r.move(FORWARD);
			paintFloor();
			r.move(BACKWARD);

		}

		//paints region to the right
		if (r.check(RIGHT)==EMPTY)
		{
			r.turn(RIGHT);
			paintFloor();
			r.turn(LEFT);

		}

			//paints region to the left
		if (r.check(LEFT)==EMPTY)
		{
			r.turn(LEFT);
			paintFloor();
			r.turn(RIGHT);

		}

		// Paint the region at the BACK
		// starting and finishing at the original direction
		if( r.check( BACK ) == EMPTY)
		{
			r.turn( BACK ) ;
			paintFloor() ;
			r.turn( BACK ) ;
		}
		//marks the current cell as blue
		r.paint(RED);

	}

}
