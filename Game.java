/* 
Name: Game
Author: James Quigley
Create On: 9/15/15
Updated On: 
Contributors:

Description: Game class that holds all of the slide objects in order to organize them
and to have the ability to save the game.
 */

public class Game{
	private String name;
	private List<Slide> gameSlides;

	public Game(){
		name = "";
		gameSlides = new ArrayList<Slide>();
	}

	public Game(String gameName, List<Slide> slideList){
		name = gameName;
		gameSlides = slideList;
	}

	public String getName(){
		return name;
	}

	public void setName(String gameName){
		name = gameName;
	}

	public List<Slide> getGameSlides(){
		return gameSlides;
	}

	public void setGameSlides(List<Slide> slideList){
		gameSlides = slideList;
	}

	//Returns -1 if failure to save
	public int saveGame(String savePath){
		int success = -1;
		//Create or open save file
		//Write all necessary data
		//Change success flag
		return success;
	}

	public int loadGame(String savePath){
		int success = -1;
		String gameName;
		List<Slide> slideList;
		//Open save file
		//Read all data
		//Change success flag
		name = gameName;
		gameSlides = slideList;
		return success;
	}

	public void addSlide(Slide slide){
		gameSlides.add(slide);
	}

	public void removeSlide(Slide slide){
		gameSlides.remove(slide);
	}

	public int getNumberOfSlides(){
		return gameSlides.size();
	}
}