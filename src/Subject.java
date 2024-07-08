
import java.util.ArrayList;
import obs.Observer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lakru
 */
public class Subject {
    private ArrayList<Observer> list = new ArrayList<>();
    
    public void addObserver(Observer ob){
        list.add(ob);
    }
    public void removeObserver(Observer ob){
        list.remove(ob);
    }
    
    public void sendAll(int value){
        for(int i = 0; i < list.size(); i++) {
           list.get(i).update(value);
        }
    }
}
