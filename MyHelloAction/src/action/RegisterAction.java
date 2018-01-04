package action;
import bean.User;
import java.util.*;

/**
 * Created by sss on 17/10/2017.
 */
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.net.HttpRequest;

public class RegisterAction extends ActionSupport {

    private String name;
    private String email;
    private long tel;
    private String wechat;
    private long idcard;
    private long qq;

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public long getIdcard() {
        return idcard;
    }

    public void setIdcard(long idcard) {
        this.idcard = idcard;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }



    @Override
    public String execute() throws Exception {
        if (name.length()>5 &&  email.contains("@") && Long.toString(tel).length()==11 ) {

            User user=new User(name,idcard,email,qq,tel,wechat);
            ActionContext actionContext=ActionContext.getContext();
            System.out.print("s "+user.getName() );

            actionContext.put("user",user);
            return myExecute();
        } else {
            return ERROR;
        }
    }


    public String myExecute() throws Exception {

        return SUCCESS;

    }

    public String myPlainText() throws Exception {

        return INPUT;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }
}