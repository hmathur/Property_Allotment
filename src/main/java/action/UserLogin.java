package action;

import com.opensymphony.xwork2.ActionSupport;
public class UserLogin extends ActionSupport{
	private String name;
	private String pwd;
	public String execute() 
	   {
	       return SUCCESS;
	   }
	public void validate()
	{
		if(getName().length()==0)
		{
			addFieldError("name","User Name is required..!");
		}
		  if(getPwd().length()==0)

          {
			  addFieldError("pwd","password is required");
			  }
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
