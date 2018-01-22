import spock.lang.Specification

class UserTest extends Specification{

    static User user
    static NormalUser normalUser

    def setup() {
        user = new User(new UserId("1"), new UserName("太郎"), new Address("東京"))
        normalUser = new NormalUser(new NormalUserId("1"), new NormalUserName("太郎"), new NormalAddress("東京"))

        println user
        println normalUser
    }

    def "test"() {
        expect:
        user.id.getValue() == normalUser.normalUserId.getValue()
        user.name.getValue() == normalUser.normalUserName.getValue()
        user.address.getValue() == normalUser.normalAddress.getValue()
    }

}