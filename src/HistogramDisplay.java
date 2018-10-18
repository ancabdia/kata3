
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
/**
 *
 * @author Andres Cabrera Diaz
 */
public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("kkhghjg");
        setContentPane(createPanel());
        pack(); 
    }   
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){       
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, 
                PlotOrientation.VERTICAL, false, false, 
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(50, "", "ulpgc.es");
        dataSet.addValue(3, "", "hotmail.es");
        dataSet.addValue(100, "", "gmail.com");
        return dataSet;
    }
}