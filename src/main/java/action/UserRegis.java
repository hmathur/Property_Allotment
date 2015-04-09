package action;

import com.opensymphony.xwork2.ActionSupport;
public class UserRegis extends ActionSupport{
	private String name;
	private String pwd;
	private String e_mail;
	private String phone;
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
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
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
			  addFieldError("pwd","Please Choose a Password..!");
			  }
		  if(getE_mail().length()==0)
		  {
			  addFieldError("e_mail","Enter the desired e_mail..!");
		  }
		  if(getPhone().length()==0)
		  {
			  addFieldError("phone","This field is mandatory..!");
		  }
}
}
	
