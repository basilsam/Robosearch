// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package RootElement.ROBOSEARCH;

import RootElement.ROBOSEARCH.Observer;

/************************************************************/
/**
 * 
 */
public interface Subject {
	/**
	 * 
	 */
	public Observer[] observers = null;

	/**
	 * 
	 * @param observer 
	 * @return 
	 */
	//attach function is explained in centralstation.java since this is just an interface
	public void attach(Observer observer, int id);

	/**
	 * 
	 * @param observer 
	 * @return 
	 */
	//detach function is explained in centralstation.java since this is just an interface
	public void detach(Observer observer, int id);
};
