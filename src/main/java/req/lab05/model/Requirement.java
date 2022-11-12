package req.lab05.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "requirements")
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private int priority;

    @Column
    private int risk;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;
}
