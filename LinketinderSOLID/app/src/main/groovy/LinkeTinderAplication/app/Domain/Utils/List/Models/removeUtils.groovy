package LinkeTinderAplication.app.Domain.Utils.List.Models

class removeUtils {

    static public removeUsingEmail(List list, String email){
        list.removeIf{ it.getEmail() == email }
    }

}
