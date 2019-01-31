import java.time.Duration;
import java.util.function.Predicate;

interface ProbabilisticIssueWiseText<I extends ProbableIssue> extends IssueWiseText<I> {
  Duration detectionTime();

  @Override
  ProbabilisticIssueWiseText<I> filtered(Predicate<? super I> issueFilter);
}
