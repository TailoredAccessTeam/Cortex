package models

abstract class CortexError(message: String) extends Exception(message)

case class JobNotFoundError(jobId: String) extends CortexError(s"Job $jobId not found")
case class UnexpectedError(message: String) extends CortexError(message)
case class AnalyzerNotFoundError(analyzerId: String) extends CortexError(s"Analyzer $analyzerId not found")
case class InvalidRequestError(message: String) extends CortexError(message)