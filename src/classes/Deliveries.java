/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dariya
 */
public class Deliveries {
    private int id;
    private Order order;
    private String deliverydate;
    private String address;
    private String thedeliveryman;

    public Deliveries(int id, Order order, String deliverydate, String address, String thedeliveryman) {
        this.id = id;
        this.order = order;
        this.deliverydate = deliverydate;
        this.address = address;
        this.thedeliveryman = thedeliveryman;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public String getAddress() {
        return address;
    }

    public String getThedeliveryman() {
        return thedeliveryman;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setThedeliveryman(String thedeliveryman) {
        this.thedeliveryman = thedeliveryman;
    }
    
}
