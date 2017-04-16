package kathakali.core.data

sealed trait Node

object Node {
  final case class NodeElement(element: Element) extends Node
  final case class NodeInstruction(instruction: Instruction) extends Node
  final case class NodeContent(content: Content) extends Node
  final case class NodeComment(comment: String) extends Node
}
