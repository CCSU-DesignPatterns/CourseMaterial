package edu.ccsu.designpatterns.vehicleAbstractFactory;

/**
 * Concrete class
 */
public class Bike extends VehicleBase{
  public Bike(){
    super(new HumanPowered());
  }

  @Override
  public double getVehicleSoundLevel() {
    return 0;
  }
}
