public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName){
        this.name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I’m the droid: " + name; 
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        this.batteryLevel -= 10;
    }

    public int energyReport(){
        System.out.println("The current battery level is " + batteryLevel);
        return batteryLevel;
    }

    public void energyTransfer(Droid otherDroid, int amountToTransfer){
        this.batteryLevel -= amountToTransfer;
        otherDroid.batteryLevel += amountToTransfer;
        System.out.println(this.name + "transfer battery to " + otherDroid.name + " for " + amountToTransfer);
        System.out.println(this.name + " battery level: " + this.batteryLevel);
        System.out.println(otherDroid.name + " battery level: " + otherDroid.batteryLevel);
    }

    public static void main(String[] args){
        Droid myDroid = new Droid("Codey");
        Droid secondDroid = new Droid("Jimmy");

        System.out.println(myDroid);
        System.out.println(secondDroid);

        myDroid.performTask("dancing");
        secondDroid.performTask("jumping");

        myDroid.energyReport();
        secondDroid.energyReport();

        // Transfer Energy

        myDroid.energyTransfer(secondDroid, 10);
    }
}