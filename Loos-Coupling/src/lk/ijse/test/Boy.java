package lk.ijse.test;

public class Boy {
    public void needToChat(){
//        //Tight Coupling
//        Girl girl = new Girl();
//        while (true){
//            girl.chatting();
//        }

        //Loos coupling
        GoodGirl g= new Girl();
        g.chatting();
    }


    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.needToChat();
    }
}
