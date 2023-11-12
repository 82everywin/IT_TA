package Login_Program;

public class User {
    private String id ;
    private String pw ;
    private String nickname;

    public User(String id, String pw,String nickname) {
        this.id = id;
        this.pw = pw;
        this.nickname=nickname;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString(){
  //      System.out.printf("ID : %s, NickName : %s, Password : %s",id,nickname,pw);
        return "ID: "+id+"\tNickName: "+ nickname+"\tPassword: "+pw+"\n";
    }
}
