/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WorkQueue {
      private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
   workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
}
