package sample;
import javax.xml.ws.Endpoint;
public class TicketServicePublisher {
        /**
         * @param args
         */
        public static void main(String[] args) {
            Endpoint.publish("http://127.0.0.1:8084/ExamSvcWeb/exampass", new TicketService());
        }
    }

