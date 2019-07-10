package pl.exercise.ferry.pricing;

import java.math.BigDecimal;
import pl.exercise.ferry.ticket.BikeTicket;
import pl.exercise.ferry.ticket.BusTicket;
import pl.exercise.ferry.ticket.CarTicket;

public class PaymentService implements PriceVisitor<BigDecimal> {

  @Override
  public BigDecimal visit(BusTicket busTicket) {
    return null;
  }

  @Override
  public BigDecimal visit(BikeTicket bikeTicket) {
    return null;
  }

  @Override
  public BigDecimal visit(CarTicket carTicket) {
    return new BigDecimal(20);
  }
}
