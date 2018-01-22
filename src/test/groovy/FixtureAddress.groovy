import groovy.transform.ToString

@ToString
class FixtureAddress {
    def get(){
        new Address("東京")
    }
}
