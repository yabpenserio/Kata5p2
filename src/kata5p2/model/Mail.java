package kata5p2.model;

public class Mail {
    private String Mail;
    public Mail(String mail){
        Mail = mail;
    }
    public String getDomain(){
        return this.Mail.substring(Mail.indexOf('@')+1);
    }
    public String getMail(){
        return Mail;
    }
   
}
    
