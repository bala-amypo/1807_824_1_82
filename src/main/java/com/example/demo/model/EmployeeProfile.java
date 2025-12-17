import jakarata.presistence.*;
import java.time.LocalDataTime;

@Entity
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

    private String role;
    @coulumn(nulllable = false)
    private Boolean active = true;

    @coulumn(nulllable = false , updatable = false)
    private LocalDataTime createdAt;

    @prePersist
    public void prePersist(){
        this.createdAt = LocalDataTime.now();
    }
    public EmployeeProfile(){ }

    public Long getID(){
        return id;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(String email){
        this.email = email;
    }
    public void getTeamName(){
        return TeamName;
    }
    public void setTeamName(String TeamName){
        return TeamName;
    }


    
}