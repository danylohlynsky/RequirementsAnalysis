package req.lab05.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "general_risks")
@AllArgsConstructor
@NoArgsConstructor
public class GeneralRisk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private RiskType riskType;

    @Column
    private RiskUnderType riskUnderType;

    @Column
    private String description;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Risk> risk;
}
