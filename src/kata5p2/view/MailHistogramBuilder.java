package kata5p2.view;

import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.List;
public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mails){
        Histogram<String> histogram = new Histogram<>();
        mails.forEach(mail -> {
            histogram.increment(mail.getDomain());
        });
        return histogram;
        
    }
    
}
