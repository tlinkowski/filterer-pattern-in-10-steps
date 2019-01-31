import java.time.Duration;

interface IssueDetectionResult {
  IssueWiseText<ProbableIssue> probabilisticIssueWiseText();

  Duration detectionTime();
}
