package bean;

import java.util.List;

public class Adminlogin {
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String execute()
	{
		List result=customer.dao.Manager.checkAdmin(name, pass);
		if(result.isEmpty())
		{
			return "error"; 
		}
		else
		{
			return "success";
		}
	}

}
