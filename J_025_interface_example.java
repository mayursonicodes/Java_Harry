interface camera{
    void takeSnap();
    void recordVideo();
}

interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class buttonWalaPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling... "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Picking Call...");
    }
}

class smartPhone extends buttonWalaPhone implements camera, wifi{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] getNetworks(){
        return new String[]{"Harry", "Mayur", "Ram"};
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network... "+network);
    }
}

public class J_025_interface_example {
    public static void main(String[] args){
        smartPhone sp = new smartPhone();

        sp.callNumber(741239854);
        sp.pickCall();

        sp.takeSnap();
        sp.recordVideo();

        sp.connectToNetwork("Jio");
        String[] networks = sp.getNetworks();

        System.out.print("Networks are: ");
        for(String x: networks){
            System.out.print(x+" ");
        }
        
    }
}