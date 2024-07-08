public class UserService {
    UserDAO userDAO = new UserDAO();

    public void join(User user){
        userDAO.joinUser(user);
        System.out.println(user.getName()+"님 가입을 환영합니다.");
    }
}
