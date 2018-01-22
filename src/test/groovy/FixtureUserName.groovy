import groovy.transform.ToString

@ToString(includeFields = false)
class FixtureUserName {
    def get(){
        new UserName("太郎")
    }
}
