package lk.ijse.test;

public class Boy {
    public void needToChat(){
        Girl girl = new Girl();
        while (true){
            girl.chatting();
        }
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.needToChat();
    }
}
