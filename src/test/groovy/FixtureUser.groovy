import annotation.Address
import annotation.User
import annotation.UserId
import annotation.UserName
import groovy.transform.ToString

@ToString(includeFields = false)
class FixtureUser {
    def static get(){
        new User(new UserId("1"), new UserName("太郎"), new Address("東京"))
    }
}
