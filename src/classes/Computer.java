/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dariya
 */
public class Computer {
    private String id;
    private String model;
    private String count;
    private String processor;
    private String videocard;
    private String mothercard;
    private String harddrive;

    public Computer(String id, String model, String count, String processor, String videocard, String mothercard, String harddrive) {
        this.id = id;
        this.model = model;
        this.count = count;
        this.processor = processor;
        this.videocard = videocard;
        this.mothercard = mothercard;
        this.harddrive = harddrive;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getCount() {
        return count;
    }

    public String getProcessor() {
        return processor;
    }

    public String getVideocard() {
        return videocard;
    }

    public String getMothercard() {
        return mothercard;
    }

    public String getHarddrive() {
        return harddrive;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public void setMothercard(String mothercard) {
        this.mothercard = mothercard;
    }

    public void setHarddrive(String harddrive) {
        this.harddrive = harddrive;
    }
    
}
