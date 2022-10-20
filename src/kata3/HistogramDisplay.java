package kata3;
import java.awt.Dimension;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histogram;
    public HistogramDisplay(String title, Histogram<String> histogram) {
        super(title);
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
        setVisible(true);

    }
    
    public void execute(){
        setVisible(true);
    }
    
    public JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
                
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma de emials", "Dominios de emails",
                                                        "N de emails", dataset, PlotOrientation.VERTICAL, 
                                                        false, 
                                                        false,
                                                        rootPaneCheckingEnabled);
        
        return chart;
    }
   
    ///COn esta clase añadimos valores a la grafica 
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(String key: this.histogram.keySet()){
            dataset.addValue(this.histogram.get(key),"", key);
        }
        
        return dataset;
    }
    
}
