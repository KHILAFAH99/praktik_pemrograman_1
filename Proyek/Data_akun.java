
public class Data_akun {
    private String email;
    private String userName;
    private String pass;

    
    Data_akun(String userName, String pass, String email){
        this.userName = userName;
        this.pass = pass;
        this.email = email;
    }



    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    


    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }


    
    public void setPass(String pass){
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }
}
