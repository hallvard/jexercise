package interfaces;

public interface Named {

	public String getGivenName();
	public void setGivenName(String name);
	
	public String getFamilyName();
	public void setFamilyName(String name);
	
	public String getFullName();
	public void setFullName(String name);
}
