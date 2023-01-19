package kata5p2.view;

import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.List;
public class MailHistogramBuilder {
    private String fileName;
    public MailHistogramBuilder(String filename){
        fileName = filename;
    }
    public Histogram<String> build(List<Mail> mails){
        Histogram<String> histogram = new Histogram<String>();
        for (Mail mail : mails) {
            histogram.increment(mail.getDomain());
            
        }
        return histogram;
        
    }
    
}
