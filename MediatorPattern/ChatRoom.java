package MediatorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatRoom implements ChatMediator {

    List<Users> users = new ArrayList<>();

    public void addUser(Users user){
        users.add(user);
    }

    public void sendMessage(String sender, String msg){
        for(Users user: users){
            if(!Objects.equals(sender, user.getName())){
                user.receiveMessage(msg,sender);
            }
        }
    }
}

