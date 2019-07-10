package pl.exercise.ferry.ticket;

import pl.exercise.ferry.pricing.PriceVisitor;
import pl.exercise.ferry.vehicle.VehicleType;

public class CarTicket extends VehicleTicket {

  public CarTicket(String owner) {
    super(VehicleType.CAR, owner);
  }

  @Override
  public <T> T accept(PriceVisitor<T> visitor) {
    return visitor.visit(this);
  }
}
