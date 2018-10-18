/**
 *
 * @author Andres Cabrera Diaz
 */
public class main {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        for (int i = 0; i < 10; i++) {
            histogram.increment("gmail.com");
        }
        histogram.increment("hotmail.com");
        for (int i = 0; i < 6; i++) {
            histogram.increment("ulpgc.es");
        }
        
        HistogramDisplay histo = new HistogramDisplay(histogram);    
        histo.execute();
    }
    
}