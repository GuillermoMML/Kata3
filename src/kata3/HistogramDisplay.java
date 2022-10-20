package kata3;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(String title) {
        super(title);
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
        dataset.addValue(8,"","ulpgc.es");
        dataset.addValue(2,"","hotmail.com");
        dataset.addValue(7,"","gmail.es");
        dataset.addValue(1,"","holas");
        dataset.addValue(15,"","adios");
        return dataset;
    }
    
}
