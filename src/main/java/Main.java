import annotation.Address;
import annotation.User;
import annotation.UserId;
import annotation.UserName;

public class Main {
    public static void main(String args[]){

        System.out.println(new User(new UserId("1"), new UserName("太郎"), new Address("東京")));
    }

    public void output(){
        new User(new UserId("1"), new UserName("太郎"), new Address("東京"));
    }
}
