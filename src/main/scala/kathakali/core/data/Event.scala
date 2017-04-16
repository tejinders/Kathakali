package kathakali.core.data

sealed trait Event

object Event {
  case object EventBeginDocument extends Event
  case object EventEndDocument extends Event
  final case class EventBeginDoctype(name: String, id: Option[ExternalID]) extends Event
  case object EventEndDoctype extends Event
  final case class EventInstruction(instruction: Instruction) extends Event
  final case class EventBeginElement(name: Name, attributes: Seq[(Name, Seq[Content])]) extends Event
  final case class EventEndElement(name: Name) extends Event
  final case class EventContent(content: Content) extends Event
  final case class EventComment(comment: String) extends Event
  final case class EventCDATA(cdata: String) extends Event
}
