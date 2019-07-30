// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package RootElement.ROBOSEARCH;

import java.awt.Color;

import javax.vecmath.Color3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import simbad.sim.Box;
import simbad.sim.EnvironmentDescription;
import simbad.sim.Wall;

/************************************************************/
/**
 * 
 */
public class Environment extends EnvironmentDescription {
	/**
	 * 
	 */
	private double mapSize;
	/**
	 * 
	 */
	private int obstacleHeight;
	/**
	 * 
	 */
	private Robot[] robot;
	/**
	 * 
	 */
	private AdapterInterface adapterInterface;
	/**
	 * 
	 */
	private CentralStation centralstation;

	/**
	 * 
	 */
	//In environment class robots and walls are created. If the number of robots
	//are going to be changed important changes that are required:
	//1.Change the array size. The array size is hardcoded and it stores observers in subject.java
	public Environment() {
		this.light1IsOn = true;
		this.light2IsOn = true;
		
		this.centralstation = CentralStation.getInstance();
		this.mapSize = 25.0;
		this.obstacleHeight = 2;
		robot = new Robot[4];
		
		
        robot[0] = new Robot(new Vector3d(11,  0, -11), "Robot-1",1);
        robot[1] = new Robot(new Vector3d(-11,  0, -11), "Robot-2", 2);
        robot[2] = new Robot(new Vector3d(-11,  0, 11), "Robot-3", 3);
        robot[3] = new Robot(new Vector3d(11,  0, 11), "Robot-4", 4);
        
        //subscribes the robots to the subject entity.
		for (int i = 0; i < 4;  i++)
		{
			this.centralstation.attach(robot[i], i);
			this.add(robot[i]);
		}
        
		//Walls
        Wall w5 = new Wall(new Vector3d(0, 0, -11.65), 25, this.obstacleHeight, this);
        w5.setColor(new Color3f(Color.WHITE));
        //w4.rotate90(1);
        add(w5);
        Wall w6 = new Wall(new Vector3d(0, 0, 11.65), 25, this.obstacleHeight, this);
        w6.setColor(new Color3f(Color.WHITE));
        //w4.rotate90(1);
        add(w6);
        Wall w7 = new Wall(new Vector3d(-11.65, 0, 0), 25, this.obstacleHeight, this);
        w7.setColor(new Color3f(Color.WHITE));
        w7.rotate90(1);
        add(w7);
        Wall w8 = new Wall(new Vector3d(11.65, 0, 0), 25, this.obstacleHeight, this);
        w8.setColor(new Color3f(Color.WHITE));
        w8.rotate90(1);
        add(w8);
       
        ///Boxes
        Box b1 = new Box(new Vector3d(2, 0 , 4), new Vector3f(1, 1, 1), this);
        b1.setColor(new Color3f(Color.GREEN));
        add(b1);
        
        Box b2 = new Box(new Vector3d(-6, 0 , -9), new Vector3f(1, 1, 1), this);
        b2.setColor(new Color3f(Color.GREEN));
        add(b2);
        
        Box b3 = new Box(new Vector3d(1, 0 , -9), new Vector3f(1, 1, 1), this);
        b3.setColor(new Color3f(Color.BLUE));
        add(b3);
        
        Box b4 = new Box(new Vector3d(6, 0 , 4), new Vector3f(1, 1, 1), this);
        b4.setColor(new Color3f(Color.BLUE));
        add(b4);
        
        Box b5 = new Box(new Vector3d(8, 0 , -7), new Vector3f(1, 1, 1), this);
        b5.setColor(new Color3f(Color.YELLOW));
        add(b5);
        
        Box b6 = new Box(new Vector3d(-1, 0 , 2), new Vector3f(1, 1, 1), this);
        b6.setColor(new Color3f(Color.RED));
        add(b6);
        
        Box b7 = new Box(new Vector3d(-5, 0 , 10), new Vector3f(1, 1, 1), this);
        b7.setColor(new Color3f(Color.RED));
        add(b7);
        
        Box b9 = new Box(new Vector3d(-5, 0 , -6), new Vector3f(1, 1, 1), this);
        b9.setColor(new Color3f(Color.YELLOW));
        add(b9);
        
        Box b10 = new Box(new Vector3d(8, 0 , 2), new Vector3f(1, 1, 1), this);
        b10.setColor(new Color3f(Color.CYAN));
        add(b10);
        
        Box b11 = new Box(new Vector3d(-4, 0 , 4), new Vector3f(1, 1, 1), this);
        b11.setColor(new Color3f(Color.CYAN));
        add(b11);
        
        Box b12 = new Box(new Vector3d(-8, 0 , 0), new Vector3f(1, 1, 1), this);
        b12.setColor(new Color3f(Color.MAGENTA));
        add(b12);
        
        Box b13 = new Box(new Vector3d(4, 0 , -7), new Vector3f(1, 1, 1), this);
        b13.setColor(new Color3f(Color.MAGENTA));
        add(b13);
	}

	/**
	 * 
	 * @return 
	 */
	public double getMapSize() {
		return mapSize;
	}
};