package bean;

/**
 * Created by sss on 20/10/2017.
 */
public class User {

    private String name;
    private long idcard;
    private String email;
    private long qq;
    private long tel;
    private String wechat;

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdcard() {
        return idcard;
    }

    public void setIdcard(long idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public User() {

    }

    public User(String name, long idcard, String email, long qq, long tel, String wechat) {
        this.name = name;
        this.idcard = idcard;
        this.email = email;
        this.qq = qq;
        this.tel = tel;
        this.wechat = wechat;
    }
}
