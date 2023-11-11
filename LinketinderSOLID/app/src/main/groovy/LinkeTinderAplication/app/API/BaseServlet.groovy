package LinkeTinderAplication.app.API

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper

abstract class BaseServlet extends HttpServlet{

    protected JsonNode readJsonRequestBody(HttpServletRequest req) {
        StringBuilder requestBody = new StringBuilder()

        try (BufferedReader reader = req.getReader()) {
            String line
            while ((line = reader.readLine()) != null) {
                requestBody.append(line)
            }
        }

        ObjectMapper objectMapper = new ObjectMapper()
        return objectMapper.readTree(requestBody.toString())
    }

    protected List<String> extractValuesFromJson(JsonNode jsonNode) {
        List<String> values = []
        jsonNode.fieldNames().forEachRemaining { fieldName ->
            values.add(jsonNode.get(fieldName).asText())
        }
        return values
    }

    protected String convertListToJson(List<List<String>> listOfLists) {
        ObjectMapper objectMapper = new ObjectMapper()
        return objectMapper.writeValueAsString(listOfLists)
    }
}
