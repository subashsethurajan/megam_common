/* 
** Copyright [2012-2013] [Megam Systems]
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
** http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/
package org.megam.common.amqp

/**
 * @author ram
 *
 */
import org.megam.common.amqp._
import scalaz._
import Scalaz._
import net.liftweb.json._
import net.liftweb.json.scalaz.JsonScalaz._

trait AMQPClient {
  //def subscribe(messages1: Messages,messages2: Messages): SubscribeRequest
  def subscribe(f: AMQPResponse => ValidationNel[Error, String], key: RoutingKey): SubscribeRequest
  def publish(messages1: Messages, key: RoutingKey): PublishRequest
}