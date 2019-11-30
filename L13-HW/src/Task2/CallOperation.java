package Task2;
public class CallOperation {
    public static void main(String[] args) {
        GSM phone1 = new GSM("phone1");
        phone1.insertSimCard("0812345678");
        GSM phone2 = new GSM("phone2");
        phone2.insertSimCard("0887654321");
        GSM phone3 = new GSM("phone3");
        phone3.insertSimCard("0887654322");
        phone1.call(phone2, 15);
        phone2.call(phone1, 35);
        phone2.call(phone3, 10);

        System.out.println(phone1.getSumForCall());
        phone1.printInfoLastOutgoingCall();
        phone1.printInfoLastIncomingCall();
        System.out.println(phone2.getSumForCall());
        phone2.printInfoLastOutgoingCall();
        phone2.printInfoLastIncomingCall();
        System.out.println(phone3.getSumForCall());
        phone3.printInfoLastOutgoingCall();
        phone3.printInfoLastIncomingCall();
    }
}
