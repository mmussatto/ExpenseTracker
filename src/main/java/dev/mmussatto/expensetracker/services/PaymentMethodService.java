/*
 * Created by murilo.mussatto on 03/03/2023
 */

package dev.mmussatto.expensetracker.services;

import dev.mmussatto.expensetracker.api.model.PaymentMethodDTO;

import java.util.List;

public interface PaymentMethodService {

    List<PaymentMethodDTO> getAllPaymentMethods ();

    PaymentMethodDTO getPaymentMethodById (Integer id);

    PaymentMethodDTO getPaymentMethodByName (String name);

    PaymentMethodDTO createNewPaymentMethod (PaymentMethodDTO paymentMethodDTO);

    PaymentMethodDTO updatePaymentMethodById (Integer id, PaymentMethodDTO paymentMethodDTO);

    PaymentMethodDTO updatePaymentMethodByName (String name, PaymentMethodDTO paymentMethodDTO);

    PaymentMethodDTO patchPaymentMethodById (Integer id, PaymentMethodDTO paymentMethodDTO);

    void deletePaymentMethodById (Integer id);

    void deletePaymentMethodByName (String name);
}
