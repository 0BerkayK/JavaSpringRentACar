package kodlama.io.rentACar.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.Banner;

import javax.persistence.*;

@Table(name="cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="plate", unique = true)
    private String plate;

    @Column(name="dailyPrice")
    private double dailyPrice;

    @Column(name="modelYear")
    private int modelYear;

    @Column(name="state")
    private int state;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;


}
