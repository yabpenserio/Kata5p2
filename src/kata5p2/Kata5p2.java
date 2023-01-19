package kata5p2;

import java.io.File;
import java.util.List;
import kata5p2.Histogram;

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
