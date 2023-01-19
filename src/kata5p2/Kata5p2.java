package kata5p2;

import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailListReader;
import kata5p2.model.Mail;
import java.io.File;
import java.util.List;
import kata5p2.model.Histogram;

public class Kata5p2 {

    public static void main(String[] args) {
        String fileName = "emails.txt";
        Histogram<String> histogram = new Histogram<String>();
        List<Mail> emails = MailListReader.read(fileName);
        for (Mail email : emails) {
            histogram.increment(email.getDomain());
            
        }

        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma",
                histogram);
        histogramDisplay.execute();
    }
    
}
