package MediatorPattern;

public class Users {
    private final String name;
    private final ChatRoom chatRoom;

    public Users (String name, ChatRoom chatRoom){
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName(){
        return this.name;
    }
    public void receiveMessage(String msg, String sender){
        System.out.println(this.name + " received " + msg + " from " + sender);
    }

    public void sendMessage(String msg){
        chatRoom.sendMessage(this.name,msg);
    }
}
