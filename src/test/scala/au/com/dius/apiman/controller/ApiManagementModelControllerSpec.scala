package au.com.dius.apiman.controller

import au.com.dius.config.TestConfigurationModule
import org.scalatest.concurrent.ScalaFutures
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import uk.gov.hmrc.mongo.CurrentTime
import org.scalatra.test.scalatest.ScalatraSuite
import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.concurrent.ExecutionContext
import au.com.dius.apiman.model.ApiManagement
import au.com.dius.apiman.repository.ApiManagementRepository
import au.com.dius.test.{Awaiting, MongoSpecSupport}

class ApiManagementModelControllerSpec extends ScalatraSuite with WordSpecLike with Matchers with BeforeAndAfter with MongoSpecSupport with Awaiting {
  protected implicit def executor: ExecutionContext = ExecutionContext.global
  implicit val bindingModule = TestConfigurationModule

  import au.com.onegeek.respite.models.ModelJsonExtensions._

  val repository = new ApiManagementRepository
  addServlet(new ApiManagementController(repository = repository), "/apimanagementmodel/*")

  before {

  }

  after {

  }

  "A ApiManagementModel" should {

    "Respond on path /" in {
      get("/apimanagementmodel/") {

      }

      // ...
    }

  }
}