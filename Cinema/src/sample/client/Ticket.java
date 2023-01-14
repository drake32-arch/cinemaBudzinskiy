
package sample.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buyers" type="{http://local}buyer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="film" type="{http://local}film" minOccurs="0"/>
 *         &lt;element name="hall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="places" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {
    "buyers",
    "film",
    "hall",
    "places",
    "price",
    "time"
})
public class Ticket {

    @XmlElement(nillable = true)
    protected List<Buyer> buyers;
    protected Film film;
    protected String hall;
    @XmlElement(nillable = true)
    protected List<Integer> places;
    protected int price;
    protected String time;

    /**
     * Gets the value of the buyers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Buyer }
     * 
     * 
     */
    public List<Buyer> getBuyers() {
        if (buyers == null) {
            buyers = new ArrayList<Buyer>();
        }
        return this.buyers;
    }

    /**
     * Gets the value of the film property.
     * 
     * @return
     *     possible object is
     *     {@link Film }
     *     
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Sets the value of the film property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film }
     *     
     */
    public void setFilm(Film value) {
        this.film = value;
    }

    /**
     * Gets the value of the hall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHall() {
        return hall;
    }

    /**
     * Sets the value of the hall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHall(String value) {
        this.hall = value;
    }

    /**
     * Gets the value of the places property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the places property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlaces() {
        if (places == null) {
            places = new ArrayList<Integer>();
        }
        return this.places;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
