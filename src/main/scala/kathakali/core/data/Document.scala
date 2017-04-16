package kathakali.core.data

final case class Document(prologue: Prologue, root: Element, epilogue: Seq[Miscellaneous])
