package org.psnbtech;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class SnakeGameTest {

	@Test
	void snakeGame() throws InterruptedException{
		SnakeGame g = new SnakeGame();
		Main thread = new Main(g);
		thread.start();

            Thread.sleep(200);

		//path = [1, 31, 33, 34, 32, 38]
        KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        //path = [1, 27, 29, 30, 28, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key);
        

            Thread.sleep(300);

        
      //path = [1, 14, 15, 16, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 2, 3, 4, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 20, 22, 23, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 8, 9, 10, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 27, 29, 30, 28, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 14, 15, 17, 18, 19, 16, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 14, 15, 17, 18, 16, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 2, 3, 5, 6, 7, 4, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 2, 3, 5, 6, 4, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 20, 22, 24, 25, 26, 23, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 20, 22, 24, 25, 23, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 8, 9, 11, 12, 13, 10, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 8, 9, 11, 12, 10, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key);
      //path = [1, 31, 33, 32, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);

            Thread.sleep(3000);

        //path = [1, 27, 29, 28, 38]
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key);
        
        
	}
	@Test
	void updateSnake() throws InterruptedException {
		SnakeGame g = new SnakeGame();
		Main thread = new Main(g);
		thread.start();

            Thread.sleep(200);

        KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        
        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key);
        

            Thread.sleep(3000);
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
       

            Thread.sleep(3000);

        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key);
        

            Thread.sleep(3000);

        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key);
        
        key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key);
        

            Thread.sleep(3000);

	}
}

 class Main extends Thread {
	 private SnakeGame game;
	 
	 public Main(SnakeGame game) {
		 this.game = game;
	 }
	 
	  public void run() {
	    this.game.startGame();
	  }
	}
 
 