
import obs.Observer;
import obs.custome.Alarm;
import obs.custome.MeterForm;
import obs.custome.OverFlow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lakru
 */
public class Starter {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        
        Observer alarm = new Alarm();
        Observer meterForm = new MeterForm();
        Observer overflow = new OverFlow();
        
        Subject ob = new Subject();
        ob.addObserver(alarm);
        ob.addObserver(meterForm);
        ob.addObserver(overflow);
        
        mainWindow.setSubject(ob);
        
    }
}
