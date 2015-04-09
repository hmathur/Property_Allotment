package bean;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;

public class Userlogin extends ActionSupport {
	private String name;
	private String pass;
	SessionMap<String, String> sessionMap;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getPass()
	{
		return pass;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public String execute()
	{
		List result=customer.dao.Manager.checkUser(name, pass);
		if(result.isEmpty())
		{
			return "error";
		}
		else
		{
			return "success";
		}
	}
	
	public String logout(){
		sessionMap.invalidate();
		return "success";
		
	}
}
