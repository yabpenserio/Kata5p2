package kata5p2;

import kata5p2.view.HistogramDisplay;
import kata5p2.model.Mail;
import java.io.File;
import java.util.List;
import kata5p2.model.Histogram;
import static kata5p2.view.MailListReaderBD.read;

public class Kata5p2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        List<Mail> emails = read();
        for (Mail email : emails) {
            //Se podria constuir para contar los dominios de mail con getDomain() o con los mails con getMail()
            histogram.increment(email.getDomain());
            
        }

        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma",
                histogram);
        histogramDisplay.execute();
    }
    
}
