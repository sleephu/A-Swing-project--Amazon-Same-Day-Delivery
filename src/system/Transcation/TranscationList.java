/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Transcation;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class TranscationList {
    private ArrayList<Transcation> transcationList;

    public TranscationList() {
    transcationList = new ArrayList<>();
    }

    public ArrayList<Transcation> getTranscationList() {
        return transcationList;
    }

    public void setTranscationList(ArrayList<Transcation> transcationList) {
        this.transcationList = transcationList;
    }
    public Transcation creTranscation(){
    Transcation t= new Transcation();
    transcationList.add(t);
    return t;
    }
}
