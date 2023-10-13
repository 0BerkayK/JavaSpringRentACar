package kodlama.io.rentACar.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Db'deki id ye karşılık gelecek.
    @Column(name="id")
    private int id;
    //Db'deki name ye karşılık gelecek.
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;

}
