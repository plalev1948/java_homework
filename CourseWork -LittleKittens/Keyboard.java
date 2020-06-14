package CourseWork;

import java.awt.event.KeyEvent;

public class Keyboard {

	public static boolean[] pressed = new boolean[256];
	public static boolean[] prev = new boolean[256];
	
	
	private Keyboard() {
		
	/*We need an update method:
	 * Everything in the previous array is equal to the pressed array.
	 */
		public static void update() {
		for(int i = 0;i < 4;i++) {
			if(i == 0) prev[KeyEvent.VK_LEFT] = pressed[KeyEvent.VK_LEFT];
			if(i == 1) prev[KeyEvent.VK_RIGHT] = pressed[KeyEvent.VK_RIGHT];
			if(i == 2) prev[KeyEvent.VK_UP] = pressed[KeyEvent.VK_UP];
			if(i == 3) prev[KeyEvent.VK_DOWN] = pressed[KeyEvent.VK_DOWN];
			}
		}
	/*
	 * When we press down a key, it updates the gameboard, which method is true and what shall I move.
	 * In the end it's gonna set everything as false.	
	 */
	/* public static void keyPressed(KeyEvent e){
		pressed[e.getKeyCode()] = true;
	}
	
	public static void keyReleased(KeyEvent e){
		pressed[e.getKeyCode()] = false;
	}
	
	public static boolean typed(int keyEvent){
		return !pressed[keyEvent] && prev[keyEvent];
	}
		
	}


	public static boolean typed(int vkQ) {
		return false;
	}


	public static void update() {
		
	
*/

	}


	public static void keyReleased(KeyEvent e) {
		
	}


	public static boolean typed(int vkLeft) {
		return false;
	}


	public static void update() {

		
	}	
}
