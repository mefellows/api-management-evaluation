package au.com.dius.apiman.repository

import org.scalatest.concurrent.ScalaFutures
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import uk.gov.hmrc.mongo.CurrentTime
import org.scalatra.test.scalatest.ScalatraSuite
import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.concurrent.ExecutionContext
import au.com.dius.test.{Awaiting, MongoSpecSupport}
import au.com.dius.apiman.model.ApiManagement

class ApiManagementModelRepositorySpec extends ScalatraSuite with ScalaFutures with  WordSpecLike with Matchers with BeforeAndAfter with MongoSpecSupport with Awaiting {

  val repository = new ApiManagementRepository

  before {
    repository.removeAll
  }

  after {

  }

  "A ApiManagementModelRepository" should {

    "when ..." in {
      // ...
    }

  }
}