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
    private Long id
    
}