package kata5p2;

import kata5p2.view.HistogramDisplay;
import kata5p2.model.Mail;
import java.util.List;
import kata5p2.model.Histogram;
import static kata5p2.view.MailHistogramBuilder.build;
import static kata5p2.view.MailListReaderBD.read;

public class Kata5p2 {

    public static void main(String[] args) {
        List<Mail> emails = read();
        Histogram<String> histogram = build(emails);
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma",
                histogram);
        histogramDisplay.execute();
    }
    
}
