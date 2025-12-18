public interface EmployeeProfileService{
    User register(User user);
    String  findByEmail(String email );
    Long getUser(Long id);
}