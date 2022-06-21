package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Tries {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tryId;
    @ManyToOne
    @JoinColumn(name="user_Id", nullable = false)
    private Users users;
    @Column
    private tries numberOfTries;

    public enum tries{
        ONE,
        THREE,
        FIVE
    }
}
