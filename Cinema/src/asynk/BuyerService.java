package asynk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import javax.annotation.Resource;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceContext;
import sample.client.Buyer;

@WebService(serviceName = "Buyers", portName = "BuyersPort", targetNamespace = "http://local:8085/Buyers")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class BuyerService {
    private static List<Buyer> buyerList = new ArrayList<Buyer>();
    private static final int NAMES_COUNT = 6;
    private static final int BUYERS_COUNT = 10;
    private String firstNamesMale[] = { "Иванов", "Петров", "Сидоров", "Сафонов", "Кучеренко", "Петренко" };
    private String lastNamesMale[] = { "Иван", "Петр", "Сидор", "Сергей", "Василий", "Аристарх" };
    private Random rnd = new Random(System.currentTimeMillis());

    {
        buyerList.clear();
        for (int i=0; i<BUYERS_COUNT; i++) {
            buyerList.add(generate());
        }
    }
    private Buyer generate() {
        int firstNameIdx = rnd.nextInt(NAMES_COUNT);
        int lastNameIdx = rnd.nextInt(NAMES_COUNT);
        Buyer b = new Buyer();
        b.setFirstName(firstNamesMale[firstNameIdx]);
        b.setLastName(lastNamesMale[lastNameIdx]);
        b.setTranscriptNum("Z"+rnd.nextInt());
        b.setCount((int)(( Math.random() * (5 - 1 + 1) + 1)));
        b.setAge(rnd.nextInt(40));
        return b;
    }
    @WebMethod
    public Buyer getBuyerList() {
        try {
            Thread.sleep(1000*60); // Sleep for 1 minute

        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String args[]) {

        Endpoint.publish("http://localhost:8082/Buyers", new BuyerService());
    }

}
