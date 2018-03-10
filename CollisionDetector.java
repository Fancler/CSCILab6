package lab6;

public class CollisionDetector {
	
	
public CollisionDetector() {
	
}
	
	
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
	{ 
		 
		 if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY) 
		 {   return true; 
		 }  
		 else  {   return false;  } } 


}
