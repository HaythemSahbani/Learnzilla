package hibernate.can;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "benutzer")
public class Benutzer {

	@Id @GeneratedValue
	@Column(name = "benutzerid")
	private int benutzerid;
	
	@Column(name = "benutzername")
	private String benutzername;
	
	@Column(name = "passwort")
	private String passwort;
	
	@Column(name = "is_online")
	private boolean is_online;
	
	@Column(name = "fettigkeitsgrad")
	private int fettigkeitsgrad;
	
	@Column(name = "highscore")
	private int highscore;
	
	
	public int getBenutzerid() {
		return benutzerid;
	}
	public void setBenutzerid(int benutzerid) {
		this.benutzerid = benutzerid;
	}
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public boolean getIs_online() {
		return is_online;
	}
	public void setIs_online(boolean is_online) {
		this.is_online = is_online;
	}
	public int getFettigkeitsgrad() {
		return fettigkeitsgrad;
	}
	public void setFettigkeitsgrad(int fettigkeitsgrad) {
		this.fettigkeitsgrad = fettigkeitsgrad;
	}
	public int getHighscore() {
		return highscore;
	}
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	
	
}
