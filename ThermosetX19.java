package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

/**
 * ThermosetX19 class based on the Thermostat class
 */
public class ThermosetX19 implements Thermostat{

	private int tmp = 23;
    private FrontEnd f;
    protected String ID;
    protected boolean enabled;
    protected ControllerInterface c;

    
    /**
     * Creates a ThermosetX19 object that takes in an ID parameter and controller interface parameter
     * @param i - ID of Thermoset
     * @param c -  Controller Interface
     */
    public ThermosetX19(String i, ControllerInterface c) {
        this.ID = i;
        this.c = c;
        this.enabled = true;
        (this.f = new FrontEnd(this)).pack();
        this.f.setVisible(true);
    }

    @Override
    public int getReading() {
        return tmp ;
    }

    @Override
    public void newTemperature(int i) {
        tmp = i;
    }

    @Override
    public ControllerInterface getController() {
        return this.c;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {
        this.c = controllerInterface;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String s) {
        this.ID = s;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public boolean enabled() {
        return this.enabled;
    }
    
}



