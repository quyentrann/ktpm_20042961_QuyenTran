package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductOrder {
    private Product product;
    private int quantity;
}
