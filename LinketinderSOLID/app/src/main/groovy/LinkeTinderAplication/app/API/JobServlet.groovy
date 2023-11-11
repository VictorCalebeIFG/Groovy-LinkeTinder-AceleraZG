package LinkeTinderAplication.app.API

import LinkeTinderAplication.app.Controller.JobController
import com.fasterxml.jackson.databind.JsonNode
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/Job")
class JobServlet extends BaseServlet{
    JobController controller = new JobController()
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<List<String>> data = controller.getJobByEmail(req.getParameter("email")).collect(){it.toList()}
        String jsonData = convertListToJson(data)
        sendJsonResponse(resp,jsonData)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JsonNode json = readJsonRequestBody(req)
        List<String> data = extractValuesFromJson(json)
        controller.addJob(data)
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
