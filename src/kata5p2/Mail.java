package kata5p2;

public class Mail {
    private String Mail;
    public Mail(String mail){
        Mail = mail;
    }
    public String getDomain(){
        return this.Mail.substring(Mail.indexOf('@')+1);
    }
   
}
    
