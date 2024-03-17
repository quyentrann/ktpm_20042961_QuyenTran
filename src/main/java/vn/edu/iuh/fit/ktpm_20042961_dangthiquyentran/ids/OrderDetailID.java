package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.ids;

import lombok.*;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.Invoice;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.Product;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class OrderDetailID implements Serializable {
    private Invoice invoice;
    private Product product;
}
