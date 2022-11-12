package req.lab05.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@Table(name = "risks")
@AllArgsConstructor
@NoArgsConstructor
public class Risk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private byte rate;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    @ManyToOne(cascade = CascadeType.ALL)
    private GeneralRisk generalRisk;


    public Risk(GeneralRisk generalRisk, Project project) {
        this.generalRisk = generalRisk;
        this.project = project;
    }
}
