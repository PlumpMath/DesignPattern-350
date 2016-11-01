//import EagerSingleton.LoadBalancer;

//import LazySingleton.LoadBalancer;

import IoDHSingleton.LoadBalancer;

/**
 * Created by lingalone on 2016/10/29.
 */
public class TestClient {
    public static void main(String[] args){

        LoadBalancer balancer1 = LoadBalancer.getInstance();
        LoadBalancer balancer2 = LoadBalancer.getInstance();
        LoadBalancer balancer3 = LoadBalancer.getInstance();
        LoadBalancer balancer4 = LoadBalancer.getInstance();

        //test balancers alike
        if(balancer1==balancer2&&balancer1==balancer3&&balancer1==balancer4)
            System.out.println("it is the same.");

        balancer1.addServer("server 1");
        balancer2.addServer("server 2");
        balancer3.addServer("server 3");
        balancer4.addServer("server 4");

        LoadBalancer balancer = LoadBalancer.getInstance();
        for(int i = 0;i<10;i++)
            System.out.println(balancer.getServer());


    }
}
