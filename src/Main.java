import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//아래 코드 실행시 "00님 가입을 환영합니다." 뜨기
        UserService userService = new UserService();
        UserDAO userDAO = new UserDAO();
        Scanner sc = new Scanner(System.in);
        int input;
        User currUser = null;
        while (true) {
            System.out.println("1:회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료");
            input = sc.nextInt();
            switch (input) {
                case 1: //회원가입
                    userService.createUser();
                    break;
                case 2://로그인
                    currUser = userService.login();
                    break;
                case 3://회원정보 수정
                    if (currUser != null) {
                        userService.updateName(currUser);
                    } else {
                        System.out.println("로그인 상태가 아닙니다.");
                    }
                    break;
                case 4://탈퇴
                    userService.deleteUser(currUser);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("올바른 메뉴를 입력해주세요");
                    break;

            }

        }


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