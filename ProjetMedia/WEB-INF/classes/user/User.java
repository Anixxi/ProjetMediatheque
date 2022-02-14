package user;

public class User {
	
	private String login;
	private String mdp;
	
	public User(String login, String mdp) {		
		this.login = login;
		this.mdp = mdp;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getMdp() {
		return mdp;
	}
}
