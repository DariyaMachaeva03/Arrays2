/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dariya
 */
public class Order {
    private String id;
    private Computer computer;
    private String orderdate;
    private String expecteddatereceipt;
    private String address;

    public Order(String id, Computer computer, String orderdate, String expecteddatereceipt, String address) {
        this.id = id;
        this.computer = computer;
        this.orderdate = orderdate;
        this.expecteddatereceipt = expecteddatereceipt;
        this.address = address;
    }

    public Computer getComputer() {
        return computer;
    }

    public String getId() {
        return id;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public String getExpecteddatereceipt() {
        return expecteddatereceipt;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public void setExpecteddatereceipt(String expecteddatereceipt) {
        this.expecteddatereceipt = expecteddatereceipt;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
