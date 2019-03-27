package pl.sda.magazyn.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "items")
public class Items {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String dimension1;
    @Column
    private String dimension2;
    @Column
    private String thickness;
    @Column
    private String norm;
    @Column
    private String material;
    @Column
    private String amount;
    @Column
    private String unit;
    @Column
    private double roughness;
    @Column
    private boolean certificateOfMaterial;
    @Column
    private boolean certificateRa;
}
