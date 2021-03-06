package au.com.dius.apiman.config

import com.escalatesoft.subcut.inject._
import reactivemongo.api.DefaultDB
import _root_.akka.actor.ActorSystem

/**
 * Created by mfellows on 24/04/2014.
 */
object ProductionConfigurationModule extends NewBindingModule(module => {
  import module._

  bind[ActorSystem] toProvider {
    ActorSystem()
  }
})

object TestConfigurationModule extends NewBindingModule(module => {
  import module._

  bind[ActorSystem] toProvider {
    ActorSystem()
  }
})