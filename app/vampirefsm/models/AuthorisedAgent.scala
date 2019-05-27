package vampirefsm.models

import uk.gov.hmrc.agentmtdidentifiers.model.Arn

case class AuthorisedAgent(arn: Arn, isWhitelisted: Boolean)
