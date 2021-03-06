import java.time.Duration;
import java.util.List;

interface ProbabilisticIssueWiseText extends IssueWiseText {
  @Override
  List<? extends ProbableIssue> issues();

  Duration detectionTime();

  @Override
  Filterer<? extends ProbabilisticIssueWiseText, ? extends ProbableIssue> filtered();
}
