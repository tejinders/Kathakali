package kathakali.core.data

final case class Prologue(before: Seq[Miscellaneous], doctype: Option[Doctype], after: Seq[Miscellaneous])
