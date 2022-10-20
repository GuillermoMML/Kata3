
package kata3;


public class Kata3 {


    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("holas");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAMA",histogram);
        histogramDisplay.execute();
    }
    
}
