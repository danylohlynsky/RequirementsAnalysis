package req.lab05.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Requirement> requirements;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Risk> risks;
}
