package sample;

import java.util.stream.IntStream;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "TicketExam", portName = "TicketExamPort", targetNamespace = "http://local")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class TicketService {

    @WebMethod(operationName = "createStatement")
    public Ticket createStatement(Buyer[] buyers,Film film,String hall, String time, int price) {
        Ticket statement = new Ticket();
        statement.setBuyers(buyers);
        statement.setFilm(film);
        statement.setHall(hall);
        statement.setTime(time);
        statement.setPrice(price);
        statement.setPlaces(new int[buyers.length]);
        return statement;
    }

    @WebMethod(operationName = "Pass")
    public Ticket pass(Ticket statement, Buyer buyer, int place) {
        Buyer[] buyers = statement.getBuyers();
        int[] ids = IntStream.range(0, buyers.length)
                .filter(i -> buyers[i].getTranscriptNum().equals(buyer.getTranscriptNum())).toArray();
        if (ids.length == 1) {
            statement.getPlaces()[ids[0]] = place;
            System.out.println("Place set: " + statement.getPlaces()[ids[0]]);
        }
        return statement;
    }

}
