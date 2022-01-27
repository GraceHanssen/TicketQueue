public class Controller {

    IO server = new IO("server");
    IO client = new IO("client");

    Button btn0 = new Button ("Kasse1", 0, Button.BUTTONTYPE.newTicket, IO.SENDER.BTN0);
    Button btn1 = new Button ("Kasse2", 1, Button.BUTTONTYPE.newTicket, IO.SENDER.BTN1);
    Button btn2 = new Button ("Kasse3", 2, Button.BUTTONTYPE.newTicket, IO.SENDER.BTN2);
    Button btn3 = new Button ("Kasse4", 3, Button.BUTTONTYPE.newTicket, IO.SENDER.BTN3);

    Button btnNew = new Button ("Ny billett", 4, Button.BUTTONTYPE.newTicket, IO.SENDER.BTNNEW);

    
}


