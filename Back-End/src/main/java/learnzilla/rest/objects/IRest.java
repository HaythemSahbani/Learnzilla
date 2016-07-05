package learnzilla.rest.objects;

import java.util.List;

public interface IRest {
	
	//Liefert objekt mit der frage und den antworten
	public FrAntwortObject getQuestionFromDB(UserObject userObject, int schwierigkeitsgrad, int kategorie, int fragentyp);
	
	//prüfe ob antwort richtig ist, gebe entsprechend geändertes userobjekt mit
	public UserObject setCorrectAnswer();
	
	//pruefen ob user existiert, falls nicht, neu erstellen
	public UserObject loginUserObject(String username, String password);
	
	//logge user aus
	public boolean logoutUserObject(UserObject userObject);
	
	//liefert eine liste mit den usern, welche gerade online sind
	public List<UserObject> getUsersOnline();

}
