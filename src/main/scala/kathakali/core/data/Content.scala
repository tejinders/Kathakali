package kathakali.core.data

sealed trait Content

object Content {
  final case class ContentText(text: String) extends Content
  final case class ContentEntity(entity: String) extends Content
}
