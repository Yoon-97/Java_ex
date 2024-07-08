import java.util.Scanner;

public class UserService {
    UserDAO userDAO = new UserDAO();

    public void createUser() {
        System.out.println("가입하실 아이디와 비밀번호, 이름을 (띄어쓰기로 구분하여) 입력하세요.");
        Scanner sc = new Scanner(System.in);

        String id;
        while (true) {
            id = sc.next();
            for (String i : userDAO.getDb().keySet()) {
                if (i.equals(id)) {
                    System.out.println("이미 가입된 아이디 입니다.");
                    return;
                }
            }
            break;
        }
        String pw = sc.next();
        String name = sc.next();

        User user = new User(id, pw, name);
        userDAO.save(user);
        System.out.println(user.getName() + "님 가입을 환영합니다.");
    }

    public User login() {
        System.out.println("아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        String pw = sc.next();
        User tmpUser;
        for (String i : userDAO.getDb().keySet()) {
            tmpUser = userDAO.getDb().get(i);
            if (i.equals(id)) {
                if (tmpUser.getPw().equals(pw)) {
                    System.out.println("환영합니다. " + tmpUser.getName() + "님");
                    return tmpUser;
                }
            }
        }
        System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
        return null;
    }

    public void updateName(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경하실 이름을 입력해주세요: ");
        user.setName(sc.next());
        System.out.print("[" + user.getName() + "] 으로 이름이 변경되었습니다.");

    }

    public void deleteUser(User user) {
        System.out.println("회원 탈퇴를 하시겠습니까?  예: 1  /  아니요: 2");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        if (res == 1) {
            userDAO.getDb().remove(user.getId());
        } else {
            return;
        }
    }
}
