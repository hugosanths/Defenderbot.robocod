package RoboDefender;
import robocode.*;
import java.awt.Color;



public class Defenderbot extends Robot{
    double safeDistance = 300;
	
	public void run() {
	
		setColors(Color.red,Color.blue,Color.green,Color.yellow,Color.blue); 

		while(true) {
		
			ahead(100);
			turnGunRight(180);
			back(100);
			turnGunRight(360);
			turnRadarRight(360);
			ahead(100);
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {

	  //Define a distância considerada segura(por exemplo, 300 pixels)
	  double safeDistance = 300;
		         turnGunRight(360);
		          fire(2);
				  
	
	
}
	
	public void onHitByBullet(HitByBulletEvent e) {

		back(50);
	}
	

	public void onHitWall(HitWallEvent e) {
	
		back(50);
	}
   public void adjustGun(double bearing) {
        double gunTurn = getHeading() + bearing - getGunHeading();
           turnGunRight(gunTurn);
    }

}
