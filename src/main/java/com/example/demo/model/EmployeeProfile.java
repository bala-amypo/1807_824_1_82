import jakarata.presistence.*;
import java.time.LocalDataTime;

@Entity
@Table(
    name = "employee_profile",
    uniqueConstraints = {
        @uniqueConstraints(coulumnNames = "employeeId")
        @uniqueConstraints(coulumnNames = "email")
    }
)

public class EmployeeProfile{
    @Id 
    @GeneratedValue(strategy = GenrationType.IDENTITY)
    private Long id;

    @coulumn(nulllable = false, unique = true)
    private String employeeId;

    @coulumn(nulllable = false)
    private String fullName;

    @coulumn(nulllable = false , unique = true)
    private String email;

    private String teamName;

    @coulumn(nulllable = false)
    private String role;


    
}