/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.NetWork;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NetWorkDirectory {
     private ArrayList<NetWork> netWorkList;

    public NetWorkDirectory() {
 netWorkList = new ArrayList<>();
    }

    public ArrayList<NetWork> getNetWorkList() {
        return netWorkList;
    }

    public void setNetWorkList(ArrayList<NetWork> netWorkList) {
        this.netWorkList = netWorkList;
    }
    public NetWork creNetWork(String name){
          NetWork nw  = new NetWork(name);
             netWorkList.add(nw);
             return nw;
    }
    public boolean checkNetWorkName(String name){
     ArrayList<String> existedNetWorkNameList = new ArrayList<>();
        for(NetWork n: netWorkList){
            existedNetWorkNameList.add(n.getName());
        }
//            if(!existedUserAccountUserNameList.contains(ua.getUserName())){
//      return true;
     
//        }
  return existedNetWorkNameList.contains(name);
  
    }
    
}
