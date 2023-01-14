package asynk.se.client;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
public class BuyerClient {
    private final static QName STUDENTS_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "Students");

    static class BuyersAsyncHandler implements AsyncHandler<GetBuyerListResponse> {
        private GetBuyerListResponse response;

        @Override
        public void handleResponse(Response<GetBuyerListResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public List<Buyers> getResponse() {
            return (List<Buyers>) response.getReturn();
        }
    };

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
    private static void printBuyerList(List<Buyer> list) {
        for (Buyer b : list) {
            String sb = b.lastName +
                    " " +
                    b.firstName +
                    " ";

            System.out.println(sb);
        }
    }
    public static void processPolling(URL url) {
        Buyers svc = new Buyers(url, STUDENTS_QNAME);
        BuyerService port = svc.getBuyersPort();
        Response<GetBuyerListResponse> response = port.getBuyerListAsync();
        while(!response.isDone()) {
            try {
                System.out.println("Polling...");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            List<Buyer> Buyers = (List<Buyer>) response.get().getReturn();
            printBuyerList(Buyers);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:82/Students?wsdl");
        BuyerClient client = new BuyerClient();
        processPolling(url);
    }
}
