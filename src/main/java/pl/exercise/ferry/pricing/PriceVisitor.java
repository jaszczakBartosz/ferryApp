package pl.exercise.ferry.pricing;

import pl.exercise.ferry.ticket.BikeTicket;
import pl.exercise.ferry.ticket.BusTicket;
import pl.exercise.ferry.ticket.CarTicket;

public interface PriceVisitor<T> {

  T visit(BusTicket customer);

  T visit(BikeTicket customer);

  T visit(CarTicket customer);
}
