package mx.edu.itszapopan.bolsatrabajo.VO;
// Generated 14/09/2017 08:24:27 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Specialty generated by hbm2java
 */
@Entity
@Table(name="Specialty"
    ,catalog="bolsa_trabajo"
)
public class Specialty  implements java.io.Serializable {


     private Integer idSpecialty;
     private Student student;
     private String name;

    public Specialty() {
    }

    public Specialty(Student student, String name) {
       this.student = student;
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idSpecialty", unique=true, nullable=false)
    public Integer getIdSpecialty() {
        return this.idSpecialty;
    }
    
    public void setIdSpecialty(Integer idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idStudent", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


