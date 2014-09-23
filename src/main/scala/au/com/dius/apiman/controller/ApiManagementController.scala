/**
 * Copyright (c) ... [TODO: Insert copyright notice]
 *
 */
package au.com.dius.apiman.controller
import scala.reflect.ClassTag

import au.com.onegeek.respite.controllers.RestController
import au.com.onegeek.respite.models.ModelJsonExtensions._
import au.com.onegeek.respite.models.Model
import com.escalatesoft.subcut.inject.BindingModule
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import scala.reflect._
import scala.reflect.ClassTag
import uk.gov.hmrc.mongo.{ReactiveMongoFormats, ReactiveRepository, MongoConnector}
import uk.gov.hmrc.mongo.ReactiveMongoFormats.objectIdFormats
import au.com.onegeek.respite.models.ModelJsonExtensions._
import au.com.onegeek.respite.controllers.support._
import au.com.dius.apiman.model.ApiManagement

/**
 * Controller class for ApiManagementModel
 */
class ApiManagementController(repository: ReactiveRepository[ApiManagement, BSONObjectID])(override implicit val bindingModule: BindingModule, override implicit val tag: ClassTag[ApiManagement], override implicit val objectIdConverter: String => BSONObjectID) extends RestController[ApiManagement, BSONObjectID]("ApiManagementModels", ApiManagement.format, repository) with MetricsRestSupport[ApiManagement, BSONObjectID] /* with Authentication with CachingRouteSupport */ {

}