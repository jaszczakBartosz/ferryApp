package pl.exercise.ferry.ticket;

import java.math.BigDecimal;
import pl.exercise.ferry.pricing.PaymentService;

public interface Ticket {

  BigDecimal getPrice(PaymentService paymentService);
}
