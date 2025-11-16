package MediatorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MediatorMain {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        Users shaurya = new Users("Shaurya",chatRoom);
        Users riya = new Users("Riya",chatRoom);
        Users booba = new Users("Booba",chatRoom);

        List<Users> usersList = new ArrayList<>();
        usersList.add(shaurya);
        usersList.add(riya);
        usersList.add(booba);

        chatRoom.addUser(shaurya);
        chatRoom.addUser(riya);
        chatRoom.addUser(booba);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            for (Users user : usersList) {
                executor.submit(() -> user.sendMessage("I am " + user.getName()));
            }
        } finally {
            executor.shutdown();
        }
    }
}
