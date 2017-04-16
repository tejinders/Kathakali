package kathakali.core.data

final case class Element(name: Name, attributes: Seq[(Name, Seq[Content])], nodes: Seq[Node])
