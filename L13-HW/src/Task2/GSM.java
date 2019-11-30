package Task2;
public class GSM {
    String model = "iPhone 4S";
    private boolean hasSimCard;
    private String simMobileNumber;
    private int outgoingCallsDuration;
    private String lastIncomingCall;
    private String lastOutgoingCall;
    String phoneName;

    //naming the phone
    GSM(String phoneName){
        this.phoneName = phoneName;
    }
    //insert Sim Card
    void insertSimCard (String simMobileNumber){
        if (simMobileNumber.matches("(08)[0-9]{8}")){
            this.simMobileNumber = simMobileNumber;
            this.hasSimCard = true;
        }
        else {
            System.out.println("Please enter a valid phone number for "+this.phoneName);
        }
    }
    //remove Sim Card
    void removeSimCard (){
        this.hasSimCard = false;
        this.simMobileNumber = null;
    }
    //call(receiver, duration)
    void call (GSM receiver, int duration){
        //check if both phones are valid, are not the same number and call duration is valid
        if (duration>0 && receiver.hasSimCard && this.hasSimCard
                && !receiver.simMobileNumber.equals(this.simMobileNumber)){
            Call newCall = new Call();
            newCall.caller = this.simMobileNumber;
            newCall.receiver = receiver.simMobileNumber;
            newCall.duration = duration;
            this.outgoingCallsDuration += duration;
            this.lastOutgoingCall = receiver.simMobileNumber;
            receiver.lastIncomingCall = this.simMobileNumber;
        }
        else {
            System.out.println("Invalid request! Check if you have your SIM card and verify" +
                    " if the phone number you are calling is active!");
        }
    }
    //get sum for call (unit price x outgoing calls)
    double getSumForCall(){
        if (this.hasSimCard){
            System.out.print("Your balance is (BGN): ");
            return this.outgoingCallsDuration*(Call.PRICE_FOR_A_MINUTE);
        }
        else {
            System.out.println("There is no SIM card in "+this.phoneName);
            return 0;
        }
    }
    //print info for the last outgoing call
    void printInfoLastOutgoingCall (){
        if (this.hasSimCard){
            System.out.println("Last outgoing call: "+this.lastOutgoingCall);
        }
        else {
            System.out.println("There is no SIM card in "+this.phoneName);
        }
    }
    //print info for the last incoming call
    void printInfoLastIncomingCall (){
        if (this.hasSimCard){
            System.out.println("Last incoming call: "+this.lastIncomingCall);
        }
        else {
            System.out.println("There is no SIM card in "+this.phoneName);
        }
    }
}
