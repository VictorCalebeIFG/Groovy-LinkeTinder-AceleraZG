package LinkeTinderAplication.app.View

import LinkeTinderAplication.app.Controller.CandidateController

class CandidateView {
    void showCandidates(){
        CandidateController controller = new  CandidateController()
        controller.getCandidates().forEach {println it.toString()}
    }

    void addCandidate(List data){
        CandidateController controller = new  CandidateController()
        controller.addCandidate(data)
    }
}
