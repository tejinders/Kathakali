package kathakali.core.data

sealed trait ExternalID

object ExternalID {
  final case class SystemID(uri: String) extends ExternalID
  final case class PublicID(id: String, uri: String) extends ExternalID
}
