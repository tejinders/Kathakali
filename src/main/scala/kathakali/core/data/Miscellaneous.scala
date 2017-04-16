package kathakali.core.data

sealed trait Miscellaneous

object Miscellaneous {
  final case class MiscInstruction(instruction: Instruction) extends Miscellaneous
  final case class MiscComment(comment: String) extends Miscellaneous
}
