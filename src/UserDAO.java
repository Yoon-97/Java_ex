import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<Integer, User> db = new HashMap<>();
    public void joinUser(User user){
        db.put(db.size() + 1, user);
    }
    public void printUser(){
        for (Integer i : db.keySet()) {
            System.out.println(db.get(i).getName());
        }

    }

}
