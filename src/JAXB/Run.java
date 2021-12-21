package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Run {
    public static void main(String[] args) throws JAXBException {
        File fileTwo = new File("D:\\Users\\shchehlyuk-b-p\\Desktop\\JAVA\\HomeTraining\\src\\JAXB\\fileTwo");
        Customer customer = new Customer();
        customer.setAge(25);
        customer.setId(12121212);
        customer.setName("Appolon");

        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(context, fileTwo);
        marshaller.marshal(customer, System.out);
    }
}
