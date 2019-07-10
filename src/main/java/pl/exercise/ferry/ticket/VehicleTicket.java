package pl.exercise.ferry.ticket;

import java.math.BigDecimal;
import pl.exercise.ferry.pricing.PaymentService;
import pl.exercise.ferry.pricing.PriceVisitor;
import pl.exercise.ferry.vehicle.VehicleType;

public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

  @Override
  public BigDecimal getPrice(PaymentService paymentService) {
    return accept(paymentService);
  }

  public abstract <T> T accept(PriceVisitor<T> visitor);
}
