public class Button {
    static enum BUTTONTYPE {
        newTicket,
        nextCustomer
    }
    String name;
    int id;
    Button(String name, int id, BUTTONTYPE type, IO.SENDER sender) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.sender = sender;
    }

}
