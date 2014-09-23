/**
 * Copyright (c) ... [TODO: Insert copyright notice]
 *
 */
package au.com.dius.apiman.model

import au.com.onegeek.respite.models.ModelJsonExtensions._
import au.com.onegeek.respite.models.Model
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import uk.gov.hmrc.mongo.{ReactiveMongoFormats, ReactiveRepository, MongoConnector}
import uk.gov.hmrc.mongo.ReactiveMongoFormats.objectIdFormats

/**
 * Model class for ApiManagement Model
 */
case class Tag(label: String)
object Tag { implicit val format = modelFormat { Json.format[Tag] } }

case class Feature(name: String, description: String, tags: Option[List[Tag]], weight: Option[Int])
object Feature { implicit val format = modelFormat { Json.format[Feature] } }

case class Criteria(feature: Feature, has: Boolean)
object Criteria { implicit val format = modelFormat { Json.format[Criteria] } }


case class ApiManagement(id: BSONObjectID = BSONObjectID.generate, synopsis: String, features: Option[List[Feature]]) extends Model[BSONObjectID]
object ApiManagement { implicit val format = modelFormat { Json.format[ApiManagement] } }
