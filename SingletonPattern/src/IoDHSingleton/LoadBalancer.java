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
    // Static Nested Class 不依赖于外部类实例被实例化
    private static class Holder{
        private static final LoadBalancer instance = new LoadBalancer();
    }

    public static LoadBalancer getInstance(){
        //第一次调用时Static Nested Class被实例化
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
