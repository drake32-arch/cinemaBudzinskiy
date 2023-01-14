package sample.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

import javax.xml.namespace.QName;

public class TicketBuy {
    private final static QName TicketExam_QNAME = new QName("http://127.0.0.1:8084/ExamSvcWeb/exampass", "PassExam");

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    private static final int NAMES_COUNT = 6;
    private static final int BUYERS_COUNT = 10;
    private String firstNamesMale[] = { "Иванов", "Петров", "Сидоров", "Сафонов", "Кучеренко", "Петренко" };
    private String lastNamesMale[] = { "Иван", "Петр", "Сидор", "Сергей", "Василий", "Аристарх" };
    private Random rnd = new Random(System.currentTimeMillis());

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

    private void process(URL url) {
        TicketExam te = new TicketExam(url, TicketExam_QNAME);
        TicketService TicketExamPort =  te.getTicketExamPort();
        Film fi = new Film();
        fi.setName("Аватар");
        fi.setPrice(200);
        Buyer[] Buyers = new Buyer[BUYERS_COUNT];
        for (int i = 0; i< BUYERS_COUNT; i++) {
            Buyers[i] = generate();
        }

        Ticket stm = TicketExamPort.createStatement(Arrays.asList(Buyers),fi,"1","12.00",200);
        TicketExamPort.pass(stm, Buyers[1], 5);
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://127.0.0.1:8084/ExamSvcWeb/exampass");
        TicketBuy client = new TicketBuy();
        client.process(url);
    }
}
