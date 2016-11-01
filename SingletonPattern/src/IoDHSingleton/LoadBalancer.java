package IoDHSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lingalone on 2016/10/29.
 */
public class LoadBalancer {
    private List serverList= null;

    private LoadBalancer(){
        serverList = new ArrayList<String>();
    }

    private void f(){

    }
    public void f(int i){}
    public void f(float i){}
    public void f(float i,int j){}
    public void f(int i,int j){}

    private static class Holder{
        private static final LoadBalancer instance = new LoadBalancer();
    }

    public static LoadBalancer getInstance(){
        return Holder.instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }
    public void removeServer(String server){
        serverList.remove(server);
    }
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }




}
