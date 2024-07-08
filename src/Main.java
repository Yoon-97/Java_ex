import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
//아래 코드 실행시 "00님 가입을 환영합니다." 뜨기
        UserService userService = new UserService();
        UserDAO userDAO = new UserDAO();

        User yoon = new User("yoon");
        User moi = new User("moi");
        userService.join(yoon);
        userService.join(moi);
        userService.userDAO.printUser();

        /*
        iPhone iPhone = new iPhone("아이폰");
        Samsung galaxy = new Samsung("삼송폰");

        User jobs = new User("잡스");
        jobs.buyPhone(iPhone);
        jobs.turnOnPhone();

        User jDragon = new User("재용");
        jDragon.buyPhone(galaxy);
        jDragon.turnOnPhone();
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        */

    }
}