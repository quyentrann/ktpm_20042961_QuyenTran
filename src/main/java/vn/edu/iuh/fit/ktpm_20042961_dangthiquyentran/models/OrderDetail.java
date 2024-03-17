package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.ids.OrderDetailID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(OrderDetailID.class)
public class OrderDetail {
    @Id
    @ManyToOne(fetch =  FetchType.LAZY)
    private Invoice invoice;
    @Id
    @ManyToOne(fetch =  FetchType.LAZY)
    private Product product;
    private int quantity;
    private double total;
}
