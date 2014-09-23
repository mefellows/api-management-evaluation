/**
 * Copyright (c) ... [TODO: Insert copyright notice]
 *
 */
package au.com.dius.apiman.repository

import au.com.onegeek.respite.models.ModelJsonExtensions._
import au.com.onegeek.respite.models.Model
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import uk.gov.hmrc.mongo.{ReactiveMongoFormats, ReactiveRepository, MongoConnector}
import uk.gov.hmrc.mongo.ReactiveMongoFormats.objectIdFormats
import au.com.onegeek.respite.models.ModelJsonExtensions._
import au.com.onegeek.respite.controllers.support.{CachingRouteSupport, MetricsSupport, MetricsRestSupport}
import au.com.dius.apiman.model.ApiManagement

/**
 * Repository object for ApiManagementModel
 */
class ApiManagementRepository(implicit mc: MongoConnector)
  extends ReactiveRepository[ApiManagement, BSONObjectID]("apimanagementmodel", mc.db, modelFormatForMongo {Json.format[ApiManagement]}, ReactiveMongoFormats.objectIdFormats) {
}