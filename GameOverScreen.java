import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The screen that is being appeard when you lose
 * 
 * @author Seretis Kleanthis 
 * @version 2
 * @date 8/6/2022
 */
public class GameOverScreen extends Screen{
    /**
     * Constructor for objects of class GameOverScreen
     */
    public GameOverScreen(){    
        super(); 
        restartLevel();
    }
    // Act
    public void act(){
        checkKeyDown(new Level());
    }
    // restart level
    public void restartLevel(){
        Timer.restartTimer();
        Hero.getInstance().resetHeroLives();
        TouchingTimer.restartTimer();
    }
}
