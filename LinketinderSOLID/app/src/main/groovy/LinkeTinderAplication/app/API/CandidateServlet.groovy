package LinkeTinderAplication.app.API

import LinkeTinderAplication.app.Controller.CandidateController
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.JsonNode

@WebServlet("/Candidate")
class CandidateServlet extends BaseServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CandidateController controller = new CandidateController()
        List<List<String>> data = controller.getCandidates().collect(){it.toList()}
        String jsonData = convertListToJson(data)

        resp.setContentType("application/json")
        resp.setCharacterEncoding("UTF-8")
        resp.getWriter().write(jsonData)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JsonNode json = readJsonRequestBody(req)
        List<String> data = extractValuesFromJson(json)

        CandidateController controller = new  CandidateController()
        controller.addCandidate(data)

        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
