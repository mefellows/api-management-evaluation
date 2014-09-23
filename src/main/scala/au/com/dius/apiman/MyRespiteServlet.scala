package au.com.dius.apiman

import org.scalatra._
import scalate.ScalateSupport

class MyRespiteServlet extends ApiManagementEvaluationStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Respite</a>.
      </body>
    </html>
  }

}
