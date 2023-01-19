package kata5p2;

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
