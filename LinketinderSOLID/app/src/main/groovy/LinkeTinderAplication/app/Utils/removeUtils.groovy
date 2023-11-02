package LinkeTinderAplication.app.Utils

class removeUtils {

    static public removeUsingEmail(List list, String email){
        list.removeIf{ it.getEmail() == email }
    }

}
