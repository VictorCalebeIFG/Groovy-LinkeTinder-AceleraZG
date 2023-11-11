package LinkeTinderAplication.app.API

import LinkeTinderAplication.app.Controller.JobController
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
}
